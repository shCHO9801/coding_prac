import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 1;
        int answer = 0;

        while(n > 0) {
            if(cnt > n) cnt = 1;
            answer++;
            n -= cnt++;
        }
        System.out.println(answer);
    }
}