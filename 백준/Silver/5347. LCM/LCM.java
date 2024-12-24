import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while(t-- > 0) {
            st = new StringTokenizer(br.readLine());
            answer.append(lcm()).append('\n');
        }

        System.out.println(answer);
    }

    private static long lcm() {
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long gcd = gcd(a, b);
        return gcd * (a/gcd) * (b/gcd);
    }

    private static long gcd(long a, long b) {
        if(a < b) {
            long t = a;
            a = b;
            b = t;
        }
        if(b==0) return a;
        return gcd(b, a % b);
    }
}