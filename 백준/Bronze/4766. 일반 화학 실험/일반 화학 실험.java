import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        double prev = -1;
        while(true) {
            double input = Double.parseDouble(br.readLine());
            if(input == 999) break;
            if(prev == -1) {
                prev = input;
                continue;
            }
            answer.append(String.format("%.2f\n", input - prev));
            prev = input;
        }

        System.out.println(answer);
    }
}