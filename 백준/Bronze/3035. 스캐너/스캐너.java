import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int zr = Integer.parseInt(st.nextToken());
        int zc = Integer.parseInt(st.nextToken());
        StringBuilder answer = new StringBuilder();

        String[] s = new String[r];

        for (int i = 0; i < r; i++) {
            s[i] = br.readLine();
        }

        for (int i = 0; i < r; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < s[i].length(); j++) {
                for (int k = 0; k < zc; k++) {
                    sb.append(s[i].charAt(j));
                }
            }
            for (int j = 0; j < zr; j++) {
                answer.append(sb).append('\n');
            }
        }

        System.out.println(answer);

    }
}