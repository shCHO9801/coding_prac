import java.util.*;
import java.io.*;

public class Main{
    static StringTokenizer st;
    public static void main (String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++){
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        }

        while(m-- > 0){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            answer.append(arr[e] - arr[s - 1]).append('\n');
        }
        System.out.println(answer.toString());
    }
}