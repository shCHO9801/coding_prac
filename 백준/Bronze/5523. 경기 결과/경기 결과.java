import java.nio.*;
import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st;
    static int n;
    static int a,b;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        while(n-->0){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(x==y) continue;
            if(x<y) b++;
            else a++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a + " " + b);
        System.out.println(sb);
    }
}