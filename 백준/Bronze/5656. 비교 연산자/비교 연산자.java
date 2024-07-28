import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st;
    static int T = 1,a,b;
    static String e;
    static boolean answer;
    static boolean getAnswer(){
        if(e.equals(">")) return a>b;
        if(e.equals(">=")) return a>=b;
        if(e.equals("<")) return a<b;
        if(e.equals("<=")) return a<=b;
        if(e.equals("==")) return a==b;
        return a!=b;
    }
    static void printAnswer(){
        System.out.printf("Case %d: ", T++);
        System.out.println(answer);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            e = st.nextToken();
            b = Integer.parseInt(st.nextToken());
            answer = false;
            if(e.equals("E"))
                break;
            answer = getAnswer();
            printAnswer();
        }
    }
}