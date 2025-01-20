import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0 & c == 0) break;

            if(b + (b - a) == c) {
                answer.append("AP ").append(c + (b - a)).append('\n');
            } else {
                answer.append("GP ").append(c * (b / a)).append('\n');
            }
        }

        System.out.println(answer);
    }
}