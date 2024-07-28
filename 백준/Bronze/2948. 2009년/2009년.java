import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st;
    static int[] month = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    static String[] answer = { "Wednesday", "Thursday", "Friday", "Saturday", "Sunday","Monday", "Tuesday"};
    static int d,m;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        d = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        for (int i = 0; i < m; i++) {
            d+=month[i];
        }
        System.out.println(answer[d%7]);
    }
}