import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long answer = 0;

        for(int i = 1; i <= n - 1; i++) {
            answer += (long) i * n + i;
        }

        System.out.println(answer);
    }
}