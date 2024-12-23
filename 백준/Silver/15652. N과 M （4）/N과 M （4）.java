import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder answer = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        f(0, n, m, answer, sb);

        System.out.println(answer);
    }

    private static void f(int depth, int n, int m, StringBuilder answer, StringBuilder sb) {
        if(depth == m) {
            answer.append(sb).append('\n');
            return;
        }
        for(int i = 1; i <= n; i++) {
            if(sb.length() != 0 && i < Integer.parseInt(sb.substring(sb.length()-2, sb.length()-1))) {
                continue;
            }
            sb.append(i).append(' ');
            f(depth + 1, n, m, answer, sb);
            sb.delete(sb.length() - 2, sb.length());
        }
    }
}