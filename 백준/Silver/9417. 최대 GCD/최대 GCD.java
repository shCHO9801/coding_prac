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
            answer.append(findMaxGcd()).append('\n');
        }

        System.out.println(answer);
    }

    private static long findMaxGcd() {
        long result = Long.MIN_VALUE;

        List<Long> list = new ArrayList<>();

        while(st.hasMoreTokens()) {
            list.add(Long.parseLong(st.nextToken()));
        }

        for(int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                result = Math.max(result, gcd(list.get(i), list.get(j)));
            }
        }

        return result;
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