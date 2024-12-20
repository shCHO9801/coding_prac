import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;
        int n = Integer.parseInt(br.readLine());
        boolean flag = false;
        Set<String> set = new HashSet<>();

        while(n-- > 0) {
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            if(!flag) {
                if(a.equals("ChongChong") || b.equals("ChongChong")) {
                    flag = true;
                    set.add(a);
                    set.add(b);
                }
            } else {
                if(set.contains(a)) {
                    set.add(b);
                }
                if(set.contains(b)) {
                    set.add(a);
                }
            }
        }
        System.out.println(set.size());
    }
}