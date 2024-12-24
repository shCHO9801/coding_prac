import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        String[] val = br.readLine().split(":");

        int a = Integer.parseInt(val[0]);
        int b = Integer.parseInt(val[1]);

        int gcd = gcd(a, b);

        answer.append(a / gcd).append(':').append(b / gcd);

        System.out.println(answer);
    }

    private static int gcd(int a, int b) {
        if(a < b) {
            int t = a;
            a = b;
            b = t;
        }
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}