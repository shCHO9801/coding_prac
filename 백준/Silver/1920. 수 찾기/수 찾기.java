import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static private int stringToInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();
        int n = stringToInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        while(n-- > 0) {
            set.add(stringToInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while(m-- > 0) {
            if(set.contains(stringToInt(st.nextToken()))) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}