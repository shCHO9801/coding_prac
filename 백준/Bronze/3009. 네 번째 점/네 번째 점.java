import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st;
    static int[]x,y;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = 3;
        x = new int[3];
        y = new int[3];
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(x);
        Arrays.sort(y);
        if(x[0]==x[1])
            System.out.print(x[2] + " ");
        else
            System.out.print(x[0] + " ");
        if(y[0]==y[1])
            System.out.print(y[2]);
        else
            System.out.print(y[0]);
    }
}