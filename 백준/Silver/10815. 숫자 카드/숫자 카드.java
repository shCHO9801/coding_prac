import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    static private int parseInt(String s) {
        return Integer.parseInt(s);
    }
    public static void main(String[] args) throws IOException{
        StringBuilder answer = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();

        int n = parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while(n-- > 0) {
            set.add(parseInt(st.nextToken()));
        }

        int m = parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while(m-- > 0){
            if(set.contains(parseInt(st.nextToken()))) {
                answer.append(1);
            } else {
                answer.append(0);
            }
            answer.append(' ');
        }

        System.out.println(answer);
    }
}
