import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            double val = Double.parseDouble(br.readLine());
            val = val * 0.8;

            answer.append("$")
                    .append(String.format("%.2f", val))
                    .append('\n');
        }

        System.out.println(answer);
    }
}