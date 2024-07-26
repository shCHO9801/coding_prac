import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st;
    static int T,a,b;
    public static int get(int a, int b){
        int idx = 2;
        int c = 1;
        while(Math.max(a,b) >= idx){
            while(a%idx == 0 && b%idx == 0){
                c*=idx;
                a/=idx;b/=idx;
            }
            idx++;
        }
        return c * a * b;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        while(T-->0){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            System.out.println(get(a,b));
        }
    }
}