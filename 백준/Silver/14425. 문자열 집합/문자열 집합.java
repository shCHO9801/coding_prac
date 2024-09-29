import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set <String> set = new HashSet<>();
        
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        while(n-- > 0){
            String x = br.readLine();
            set.add(x);
        }

        while(m-- > 0){
            String x = br.readLine();
            if(set.contains(x)){
                answer++;
            }
        }

        System.out.println(answer);
    }
}
