import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final int EMAX = 15;
        final int SMAX = 28;
        final int MMAX = 19;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 1;

        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int a, b, c;
        a = b = c = 1;

        while(a != e || b != s || c != m) {
            a++;
            b++;
            c++;
            if(a > EMAX) a = 1;
            if(b > SMAX) b = 1;
            if(c > MMAX) c = 1;
            answer++;
        }

        System.out.println(answer);
    }
}