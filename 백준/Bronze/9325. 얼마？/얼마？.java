import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            int s = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            while(n-->0){
                st = new StringTokenizer(br.readLine());
                int q = Integer.parseInt(st.nextToken());
                int p = Integer.parseInt(st.nextToken());
                s+=p*q;
            }
            System.out.println(s);
        }
    }
}