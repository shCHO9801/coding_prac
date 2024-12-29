import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        boolean[] visited = new boolean[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        List<Integer> tmp = new ArrayList<>();
        StringBuilder answer = new StringBuilder();
        f(0, 0, m, arr, visited, tmp, answer);

        System.out.println(answer);
    }

    private static void f(int depth, int start, int m, int[] arr, boolean[] visited, List<Integer> tmp, StringBuilder answer) {
        if(depth == m) {
            answer.append(getAnswer(tmp)).append('\n');
            return;
        }
        for (int i = start; i < arr.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                tmp.add(arr[i]);
                f(depth + 1, i + 1, m, arr, visited, tmp, answer);
                tmp.remove(tmp.size() - 1);
                visited[i] = false;
            }
        }
    }

    private static String getAnswer(List<Integer> list) {
        StringBuilder result = new StringBuilder();
        for(int i : list) {
            result.append(i).append(' ');
        }
        return result.toString();
    }
}