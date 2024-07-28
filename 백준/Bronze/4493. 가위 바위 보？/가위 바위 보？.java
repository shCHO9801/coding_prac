import java.nio.Buffer;
import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st;
    static int findWin(String a, String b){
        if(a.equals(b)) return 3;
        if(a.equals("R")){
            if (b.equals("S"))
                    return 1;
            else return 2;
        }
        if(a.equals("S")){
            if (b.equals("R"))
                return 2;
            else return 1;
        }
        if(a.equals("P"))
            if(b.equals("S"))
                return 2;
        return 1;
    }
    static void printWinner(int n){
        if(n == 3) {
            System.out.println("TIE");
            return;
        }
        System.out.println("Player " + n);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int p1 = 0, p2 = 0;
            int n = Integer.parseInt(br.readLine());
            while(n-->0){
                st = new StringTokenizer(br.readLine());
                String a = st.nextToken();
                String b = st.nextToken();
                int win = findWin(a,b);
                if(win == 3) continue;
                if(win == 1) p1++;
                else p2++;
            }
            if(p1==p2)
                printWinner(3);
            else if(p1>p2)
                printWinner(1);
            else printWinner(2);
        }
    }
}