import java.nio.*;
import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st;
    static int n = 10;
    static int[] a,b;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = new int[n];
        b = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        int r_a = 0, r_b = 0;
        for (int i = 0; i < n; i++) {
            if(a[i] == b[i]) continue;
            if(a[i]>b[i])
                r_a++;
            else
                r_b++;
        }
        if(r_a == r_b)
            System.out.println("D");
        else if(r_a > r_b)
            System.out.println("A");
        else
            System.out.println("B");
    }
}