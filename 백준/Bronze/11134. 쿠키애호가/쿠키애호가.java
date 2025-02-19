import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while(t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int tmp = n / c;
            answer.append(n % c != 0 ? tmp + 1 : tmp)
                    .append('\n');
        }

        System.out.println(answer);
    }
}