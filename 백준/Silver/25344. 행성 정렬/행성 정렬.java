import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n - 2; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        long lcm = list.get(0);
        
        for (int i = 1; i < list.size(); i++) {
            lcm = lcm(lcm, list.get(i));
        }

        System.out.println(lcm);
    }

    private static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    private static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}