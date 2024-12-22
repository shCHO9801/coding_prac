import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<String> set = new TreeSet<>();
        StringBuilder answer = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        boolean[] visited = new boolean[n];
        List<Integer> list = new ArrayList<>();
        f(m, 0, n, arr, list, visited, set);

        for(String s : set) {
            answer.append(s).append('\n');
        }

        System.out.println(answer);
    }

    static private void f(int depth, int start, int n, int[] arr, List<Integer> list, boolean[] visited, Set<String> set) {
        if (depth == 0) {
            StringBuilder sb = new StringBuilder();

            for (var i : list) {
                sb.append(i).append(' ');
            }

            set.add(sb.toString());
            return;
        }
        for (int i = start; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                list.add(arr[i]);
                f(depth - 1, i + 1, n, arr, list, visited, set);
                list.remove(list.size() - 1);
                visited[i] = false;
            }
        }
    }

}