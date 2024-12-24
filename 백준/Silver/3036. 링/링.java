import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int first = Integer.parseInt(st.nextToken());
        List <Integer>list = new ArrayList<>();
        while(st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        for(int i : list) {
            int gcd = gcd(first, i);
            answer.append(first/gcd).append('/').append(i/gcd).append('\n');
        }

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