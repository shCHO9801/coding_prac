import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st;
    static int n;
    static String[] answer = {" is NOT a multiple of "," is a multiple of "};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        while(true){
            int x = Integer.parseInt(br.readLine());
            int flag = 0;
            if(x==0) break;
            if(x%n==0) flag = 1;
            System.out.printf("%d%s%d.\n",x,answer[flag],n);
        }
    }
}