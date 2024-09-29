import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Set <Integer> set = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            set.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            int x = Integer.parseInt(st.nextToken());
            if(set.contains(x)){
                answer.append("1 ");
            } else {
                answer.append("0 ");
            }
        }

        System.out.println(answer);
    }
}