import java.util.*;
import java.io.*;
public class Main {
    static StringTokenizer st;
    static int n, a, b;
    static int player1 = 100, player2 = 100;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        while(n-->0){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if(a>b) player2 -= a;
            if(a<b) player1 -= b;
        }
        System.out.printf("%d\n%d",player1,player2);
    }
}