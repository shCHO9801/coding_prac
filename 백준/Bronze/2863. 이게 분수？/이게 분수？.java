import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        double a = Integer.parseInt(st.nextToken());
        double b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double c = Integer.parseInt(st.nextToken());
        double d = Integer.parseInt(st.nextToken());

        double[] tmp = {a/c + b/d, c/d + a/b, d/b + c/a, b/a + d/c};

        double max = Double.MIN_VALUE;
        int idx = 0;

        for (int i = 0; i < tmp.length; i++) {
            if(max < tmp[i]) {
                idx = i;
                max = tmp[i];
            }
        }

        System.out.println(idx);
    }
}