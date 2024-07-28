import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st;
    static int[][] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        arr = new int[T][2];
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, (a,b) -> {
            if(a[0] == b[0])
                return a[1] - b[1];
            else
                return a[0] - b[0];
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}