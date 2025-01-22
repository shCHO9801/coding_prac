import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        final double[] price = { 350.34, 230.90, 190.55, 125.30, 180.90 };
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            double result = 0;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < price.length; i++) {
                result += Integer.parseInt(st.nextToken()) * price[i];
            }

            answer.append("$")
                    .append(String.format("%.2f\n", result));
        }

        System.out.println(answer);
    }
}