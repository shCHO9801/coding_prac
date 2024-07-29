import java.util.*;
import java.io.*;
import java.nio.*;
public class Main{
    static StringTokenizer st;
    static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        while(n-->0){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            System.out.printf("%d %d\n",m*2-n, m - (m*2-n));
        }
    }
}