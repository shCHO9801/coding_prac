import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st;
    static int x,y;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] month = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] day = {"MON","TUE", "WED", "THU", "FRI", "SAT","SUN"};
        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        for (int i = 0; i < x; i++) {
            y+=month[i];
        }
        System.out.println(day[(y-1)%7]);
    }
}