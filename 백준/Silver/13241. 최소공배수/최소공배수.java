import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        long tmp  = gcd(a, b);
        long answer = tmp * (int)(a/tmp) * (int)(b/tmp);
        System.out.println(answer);
    }

    private static long gcd(int a, int b) {
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