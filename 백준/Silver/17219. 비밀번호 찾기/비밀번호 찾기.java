import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    static private int parseInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>();
        StringBuilder answer =  new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int n = parseInt(st.nextToken());
        int m = parseInt(st.nextToken());

        while(n-- > 0) {
            st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(), st.nextToken());
        }

        while(m-- > 0) {
            String key = br.readLine();
            answer.append(map.get(key)).append('\n');
        }
        System.out.println(answer);
    }
}
