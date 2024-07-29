import java.util.*;
import java.io.*;
import java.nio.*;
public class Main{
    static StringTokenizer st;
    static int answer = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            answer+=Integer.parseInt(st.nextToken());
        }
        System.out.println(answer);
    }
}