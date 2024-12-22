import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        for (int t = 1; t <= T; t++) {
            answer.append("Case # ").append(t).append(":\n");

            char[] cArr = br.readLine().toCharArray();
            int len = cArr.length;
            boolean[] visited = new boolean[len];
            StringBuilder sb = new StringBuilder();

            f(len, len, sb, visited, cArr, answer);
        }

        System.out.println(answer);
    }

    public static void f(int depth, int len, StringBuilder sb, boolean[] visited, char[] arr, StringBuilder answer) {
        if (depth == 0) {
            answer.append(sb).append("\n");
            return;
        }
        for (int i = 0; i < len; i++) {
            if (!visited[i]) {
                visited[i] = true;
                sb.append(arr[i]);
                f(depth - 1, len, sb, visited, arr, answer);
                sb.delete(sb.length() - 1, sb.length());
                visited[i] = false;
            }
        }
    }

}