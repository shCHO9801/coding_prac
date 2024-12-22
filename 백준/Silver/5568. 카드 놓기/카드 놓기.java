import java.util.*;
import java.io.*;

public class Main{
    static Set<String> set;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        set = new HashSet<>();

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        String[] arr = new String[n];

        for(int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr);

        boolean[] visited = new boolean[n];
        StringBuilder sb = new StringBuilder();

        searchCard(k, sb, n, visited, arr);

        System.out.println(set.size());
    }

    static private void searchCard(int depth, StringBuilder sb, int n, boolean[] visited, String[] cards) {
        if(depth == 0) {
            set.add(sb.toString());
            return;
        }
        for (int i = 0; i < n; i++) {
            if(!visited[i]) {
                String tmp = cards[i];
                visited[i] = true;
                sb.append(tmp);
                searchCard(depth - 1, sb, n, visited, cards);
                sb.delete(sb.length() - tmp.length(), sb.length());
                visited[i] = false;
            }
        }
    }
}