import java.util.*;
import java.io.*;
public class Main {
    static StringTokenizer st;
    static int N;
    static String s;
    static int[] ab;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ab = new int[2];
        N = Integer.parseInt(br.readLine());
        s = br.readLine();
        for(int i=0;i<s.length();i++){
            char tmp = s.charAt(i);
            if(tmp == 'A')
                ab[0]++;
            else
                ab[1]++;
        }
        System.out.println(ab[0]==ab[1]?"Tie":ab[0]>ab[1]?'A':'B');

    }
}