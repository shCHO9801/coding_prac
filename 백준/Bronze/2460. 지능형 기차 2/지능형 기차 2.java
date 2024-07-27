import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st;
    static int max = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int train = 0, max = 0;
        while(true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            train += b-a;
            max = Math.max(max,train);
            if(train == 0)
                break;
        }
        System.out.println(max);
    }
}