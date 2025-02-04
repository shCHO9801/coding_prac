import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        int maxValue = 0;

        while(true) {
            int x = Integer.parseInt(br.readLine());
            if(x == -1) break;
            list.add(x);
            maxValue = Math.max(maxValue, x);
        }

        BigInteger[] dp = new BigInteger[maxValue + 1];

        dp[1] = BigInteger.ONE;
        if(maxValue >= 2) {
            dp[2] = BigInteger.ONE;
        }
        for (int i = 3; i <= maxValue; i++) {
            dp[i] = dp[i - 1].add(dp[i - 2]);
        }

        for (int hour : list) {
            BigInteger cows = dp[hour];
            answer.append("Hour ")
                    .append(hour)
                    .append(": ")
                    .append(cows)
                    .append(" cow(s) affected\n");
        }

        System.out.println(answer);
    }
}