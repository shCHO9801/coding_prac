import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        while (true) {
            int sum = 0;
            st = new StringTokenizer(br.readLine());
            String target = st.nextToken();

            if(target.equals("#")){
                break;
            }
            target = target.toLowerCase();
            StringBuilder s = new StringBuilder();

            while(st.hasMoreTokens()) {
                s.append(st.nextToken());
            }

            for(String c : s.toString().toLowerCase().split("")) {
                if(c.equals(target)) {
                    sum += 1;
                }
            }

            answer.append(target).append(" ").append(sum).append('\n');
        }

        System.out.println(answer);
    }
}