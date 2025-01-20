import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        int T = 1;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());
            double c = Double.parseDouble(st.nextToken());

            if(a == 0 && b == 0 && c == 0) {
                break;
            }

            answer.append("Triangle #").append(T++).append('\n');

            if(a == -1) {
                if(c <= b) {
                    answer.append("Impossible.");
                } else {
                    answer.append("a = ").append(String.format("%.3f", findLine(b, c)));
                }
            } else if (b == -1) {
                if(c <= a) {
                    answer.append("Impossible.");
                } else {
                    answer.append("b = ").append(String.format("%.3f", findLine(a, c)));
                }
            } else {
                answer.append("c = ").append(String.format("%.3f", Math.sqrt((a * a) + (b * b))));
            }
            answer.append("\n\n");
        }

        System.out.println(answer);
    }

    private static double findLine(double a, double c) {
        return Math.sqrt((c * c) - (a * a));
    }
}