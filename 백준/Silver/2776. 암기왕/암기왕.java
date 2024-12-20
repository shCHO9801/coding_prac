import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    private static int parseInt(String s) {
        return Integer.parseInt(s);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        int t = parseInt(br.readLine());
        while(t-- > 0) {
            Set<Integer> set = new HashSet<>();

            int n = parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            while(st.hasMoreTokens()) {
                set.add(parseInt(st.nextToken()));
            }

            int m = parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            while(st.hasMoreTokens()) {
                int x = parseInt(st.nextToken());
                if(set.contains(x)) {
                    answer.append(1);
                } else {
                    answer.append(0);
                }
                answer.append('\n');
            }
        }

        System.out.println(answer);
    }
}