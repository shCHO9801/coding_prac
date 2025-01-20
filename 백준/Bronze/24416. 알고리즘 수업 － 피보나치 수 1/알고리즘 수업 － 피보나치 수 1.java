import java.io.*;
import java.util.*;

public class Main {
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        cnt = 0;
        int n = Integer.parseInt(br.readLine());

        fibo(n);
        answer.append(cnt + 1).append(' ');

        cnt = 0;

        fibonacci(n);
        answer.append(cnt);
        System.out.println(answer);
    }

    private static int fibo(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }
        cnt++;
        return fibo(n - 1) + fibo(n - 2);
    }

    private static int fibonacci(int n) {
        int[] dp = new int[n + 1];
        dp[1] = dp[2] = 1;

        for (int i = 3; i < n + 1; i++) {
            cnt++;
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}