import java.io.*;
import java.util.*;

public class Main {
    private static Map<Character, Integer> map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 0;

        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());

        System.out.println(sigma(a, b));
    }

    private static Long sigma(long a, long b) {
        if(a >= b) {
            return (a + b) * (a - b + 1) / 2;
        } else {
            return (a + b) * ((b - a + 1)) / 2;
        }
    }
}