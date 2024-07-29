import java.util.*;
import java.io.*;
import java.nio.*;
public class Main{
    static StringTokenizer st;
    static int a,b;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if(a==0 && b==0) break;
            System.out.printf("%d %d / %d\n",a/b, a%b, b);
        }
    }
}