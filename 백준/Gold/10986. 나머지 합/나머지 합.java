import java.util.*;
import java.nio.*;
import java.io.*;

public class Main{
    static StringTokenizer st;
    public static int read(){
        return Integer.parseInt(st.nextToken());
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long answer = 0;

        st = new StringTokenizer(br.readLine());
        int n = read();
        int m = read();

        long[] arr = new long[n + 1];
        long[] counter = new long[m];
        st = new StringTokenizer(br.readLine());

        for(int i = 1; i < arr.length; i++){
            arr[i] = read() + arr[i - 1];
        }

        for(int i = 1; i < arr.length; i++){
            long tmp = arr[i] % m;
            counter[(int)tmp]++;

            if(tmp == 0) answer++;
        }

        for (int i = 0; i < m; i++) {
            if(counter[i] > 1){
                answer += counter[i] * (counter[i] - 1) / 2;
            }
        }

        System.out.println(answer);
    }
}