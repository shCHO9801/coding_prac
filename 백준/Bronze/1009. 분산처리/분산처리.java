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
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int tmp = 1;
            for (int i = 0; i < b; i++) {
                tmp = tmp * a % 10;
            }
            answer.append(tmp == 0 ? 10 : tmp).append('\n');
        }
        System.out.println(answer);
    }
}