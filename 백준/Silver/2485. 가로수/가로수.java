import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Long> list = new ArrayList<>();

        long n = parseLong(br.readLine()) - 1;
        long answer = 0;

        if(n==1) {
            System.out.println(0);
            return;
        }

        long cur = parseLong(br.readLine());

        while(n-- > 0) {
            long next = parseLong(br.readLine());
            list.add(next - cur);
            cur = next;
        }

        long gcdValue = list.get(0);
        for(int i = 1; i < list.size(); i++) {
            gcdValue = gcd(gcdValue, list.get(i));
        }

        for(long i : list) {
            answer += i / gcdValue - 1;
        }

        System.out.println(answer);
    }


    private static long parseLong(String s) {
        return Long.parseLong(s);
    }

    private static long gcd(long a, long b) {
        if(a < b) {
            long t = a;
            a = b;
            b = t;
        }
        if(b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
