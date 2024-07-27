import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        while(n-->0){
            int t = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int answer = 0;
            while(t-->0)
                answer += Integer.parseInt(st.nextToken());
            System.out.println(answer);
        }
    }
}