import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st;
    static int n, answer;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        while(n-->0){
            st = new StringTokenizer(br.readLine());
            int student = Integer.parseInt(st.nextToken());
            int apple = Integer.parseInt(st.nextToken());
            answer+=apple%student;
        }
        System.out.println(answer);
    }
}