import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int answer = 0;

        int cur = x;

        do {
            answer++;
            int one = (cur / 10 + cur % 10) % 10;
            cur = cur % 10 * 10 + one;

        }while (cur != x);

        System.out.println(answer);
    }

}