import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        StringBuilder answer = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        boolean[] visited = new boolean[n];

        f(m, n, answer, sb, visited, arr);

        System.out.println(answer);
    }

    static private void f(int depth, int n, StringBuilder answer, StringBuilder sb, boolean[] visited, int[] arr) {
        if(depth == 0) {
            answer.append(sb).append('\n');
            return;
        }
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                sb.append(arr[i]).append(' ');
                f(depth - 1, n, answer, sb, visited, arr);
                visited[i] = false;
                sb.delete(sb.length() - 2, sb.length());
            }
        }
    }
}