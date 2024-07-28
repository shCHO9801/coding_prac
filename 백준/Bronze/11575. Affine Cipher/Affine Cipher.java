import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st;
    static int a,b;
    static String s;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] ch;
        while(n-->0){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            ch = br.readLine().toCharArray();
            for (int i = 0; i < ch.length; i++) {
                int tmp = ch[i] - 'A';
                tmp = (a*tmp+b)%26+'A';
                ch[i] = (char)tmp;
            }
            System.out.println(new String(ch));
        }
    }
}