import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st;
    static  int n;
    static String[] nice = {"nice", "not nice"};
    static int goodNumber(String l, String r){
        int left = getLeft(l);
        int right = getRight(r);
        int answer = Math.abs(left-right);
        return answer <=100 ? 0:1;
    }
    static int getLeft(String l){
        int result = 0;
        int mul = (int)Math.pow(26,l.length()-1);
        for (int i = 0; i < l.length(); i++) {
            int tmp = l.charAt(i) - 'A';
            result += tmp*mul;
            mul/=26;
        }
        return result;
    }
    static int getRight(String r){
        int result = Integer.parseInt(r);
        return result;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        while(n-->0){
            st = new StringTokenizer(br.readLine(), "-");
            String left = st.nextToken();
            String right = st.nextToken();
            int answer = goodNumber(left,right);
            System.out.println(nice[answer]);
        }
    }
}