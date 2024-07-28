import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st;
    static int N;
    static int[] arr;
    static int count;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[101];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(st.nextToken());
            if(arr[x]!=0){
                count++;continue;
            }
            arr[x]++;
        }
        System.out.println(count);
    }
}