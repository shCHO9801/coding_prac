import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long answer = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        for(char i : a.toCharArray()) {
            for(char j : b.toCharArray()) {
                answer += (long) (i - '0') * (j - '0');
            }
        }

        System.out.println(answer);
    }
}