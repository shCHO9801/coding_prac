import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st;
    static int T,N;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        while(T-->0){
            String name = "";
            int val = -1;
            N = Integer.parseInt(br.readLine());
            while(N-->0){
                st = new StringTokenizer(br.readLine());
                String s = st.nextToken();
                int L = Integer.parseInt(st.nextToken());
                if(val < L){
                    val = L;
                    name = s;
                }
            }
            System.out.println(name);
        }
    }
}