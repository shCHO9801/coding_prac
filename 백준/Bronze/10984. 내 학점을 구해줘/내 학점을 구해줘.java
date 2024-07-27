import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            int total = 0;
            float total_score = 0;
            int n = Integer.parseInt(br.readLine());
            while(n-->0){
                st = new StringTokenizer(br.readLine());
                int score = Integer.parseInt(st.nextToken());
                float grade = Float.parseFloat(st.nextToken());
                total += score;
                total_score += grade*score;
            }
            System.out.printf("%d %.1f\n",total, total_score/total);
        }
    }
}