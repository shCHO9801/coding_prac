import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        long aj = Integer.parseInt(st.nextToken());
        long am = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long bj = Integer.parseInt(st.nextToken());
        long bm = Integer.parseInt(st.nextToken());

        aj = aj * bm + bj * am;
        am *= bm;

        long gcd = gcd(aj, am);
        System.out.println(aj / gcd + " " + am / gcd);
    }

    private static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    private static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}