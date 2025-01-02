import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int result = 0;
            for (int a = 1; a < n; a++) {
                for (int b = a + 1; b < n; b++) {
                    if(((a * a) + (b * b) + m) % (a * b) == 0) {
                        result++;
                    }
                }
            }
            answer.append(result).append('\n');
        }
        System.out.println(answer);
    }
}