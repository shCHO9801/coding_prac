import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            answer.append(lcm(a, b)).append('\n');
        }

        System.out.println(answer);
    }

    private static int lcm(int a, int b) {
        int gcd = gcd(a, b);
        a /= gcd;
        b /= gcd;
        return gcd * a * b;
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