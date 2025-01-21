import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        int maxSize = 0;

        st = new StringTokenizer(br.readLine());
        StringBuilder s1 = new StringBuilder(st.nextToken());
        StringBuilder s2 = new StringBuilder(st.nextToken());

        maxSize = Math.max(s1.length(), s2.length());

        while(s1.length() < maxSize) {
            s1.insert(0, "0");
        }

        while(s2.length() < maxSize) {
            s2.insert(0, "0");
        }

        for (int i = 0; i < maxSize; i++) {
            int a = s1.charAt(i) - '0';
            int b = s2.charAt(i) - '0';

            answer.append(a + b);
        }

        System.out.println(answer);
    }
}