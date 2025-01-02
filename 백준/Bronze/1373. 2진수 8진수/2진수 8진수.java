import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        String s = br.readLine();
        int len = s.length();
        StringBuilder sb = new StringBuilder();

        while(len % 3 != 0) {
            sb.append('0');
            len++;
        }
        sb.append(s);

        for (int i = 0; i < len; i+=3) {
            String tmp = sb.substring(i, i + 3);
            int a = Integer.parseInt(String.valueOf(tmp.charAt(0))) * 4;
            int b = Integer.parseInt(String.valueOf(tmp.charAt(1))) * 2;
            int c = Integer.parseInt(String.valueOf(tmp.charAt(2)));
            answer.append(a + b + c);
        }

        System.out.println(answer);
    }
}