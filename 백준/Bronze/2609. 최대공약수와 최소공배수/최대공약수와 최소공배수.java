import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        StringBuilder answer = new StringBuilder();

        int gcd = gcd(a, b);
        int lcm = gcd * (a / gcd) * (b / gcd);
        answer.append(gcd).append('\n').append(lcm);
        System.out.println(answer);
    }

    private static int gcd(int a, int b) {
        if(a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        if(b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}