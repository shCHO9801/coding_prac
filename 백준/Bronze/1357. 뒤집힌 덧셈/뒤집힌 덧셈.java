import java.util.*;
import java.io.*;
public class Main{
    public static int reverseString(String s){
        String tmp = "";
        for (int i = s.length()-1; i >= 0; i--) {
            tmp+=String.valueOf(s.charAt(i));
        }
        return Integer.parseInt(tmp);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int rev = 0;
        for (int i = 0; i < 2; i++) {
            String s = st.nextToken();
            rev += reverseString(s);
        }
        System.out.println(reverseString(rev+""));

    }
}