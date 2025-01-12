import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] cups = new int[4];
        cups[1] = 1;

        int m = Integer.parseInt(br.readLine());
        while(m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int tmp = cups[a];
            cups[a] = cups[b];
            cups[b] = tmp;
        }

        for(int i = 1; i < cups.length; i++) {
            if(cups[i] == 1) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}