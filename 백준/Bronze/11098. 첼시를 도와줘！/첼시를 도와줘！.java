import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st;
    static int n, p, max;
    static String memoName;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        while(n-->0){
            p = Integer.parseInt(br.readLine());
            max = -1;
            while(p-->0){
                st = new StringTokenizer(br.readLine());
                int c = Integer.parseInt(st.nextToken());
                String name = st.nextToken();
                if(c > max){
                    max = c;
                    memoName = name;
                }
            }
            System.out.println(memoName);
        }
    }
}