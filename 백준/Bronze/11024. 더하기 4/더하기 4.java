import java.util.*;
import java.io.*;
import java.nio.*;
public class Main{
    static StringTokenizer st;
    static int answer, T;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        while(T-->0){
            st = new StringTokenizer(br.readLine());
            answer = 0;
            while(st.hasMoreTokens()){
                answer += Integer.parseInt(st.nextToken());
            }
            System.out.println(answer);
        }
    }
}