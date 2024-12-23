import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        double answer = f(n) / (f(k) * f(n-k));
        System.out.println((int) answer);
    }

    private static double f(int n) {
        if(n <= 1) {
            return 1;
        }
        return n * f(n - 1);
    }
}