import java.util.*;
import java.io.*;
public class Main {
    static StringTokenizer st;
    static int a,b;
    static int answer;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if(a==b && a==0) break;
            System.out.println(a+b);
        }
    }
}