import java.util.*;
import java.io.*;
import java.nio.*;
public class Main{
    static StringTokenizer st;
    static Integer[] a,b;
    static int n, answer;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        a = new Integer[n];
        b = new Integer[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        Arrays.sort(b, (x,y)->{
            return y - x;
        });
        for (int i = 0; i < n; i++) {
            answer += a[i] * b[i];
        }
        System.out.println(answer);
    }
}