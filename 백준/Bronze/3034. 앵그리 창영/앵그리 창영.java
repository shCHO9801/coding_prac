import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        double c = Math.sqrt((w * w) + (h * h));

        while(n-- > 0) {
            int x = Integer.parseInt(br.readLine());
            if(c >= x) {
                answer.append("DA\n");
            } else {
                answer.append("NE\n");
            }
        }

        System.out.println(answer);
    }
}