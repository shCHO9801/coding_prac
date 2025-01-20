import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            boolean[] arr = new boolean[n + 1];

            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j+=i) {
                    arr[j] = !arr[j];
                }
            }

            int cnt = 0;
            for(boolean i : arr) {
                if(i) cnt++;
            }
            answer.append(cnt).append('\n');
        }

        System.out.println(answer);
    }
}