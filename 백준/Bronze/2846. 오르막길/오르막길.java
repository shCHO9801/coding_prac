import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        int n = Integer.parseInt(br.readLine());
        int[] arr =  new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cur = arr[0];
        int h = 0;

        for (int i = 1; i < n; i++) {
            if(cur < arr[i]) {
                h += arr[i] - cur;
                answer = Math.max(answer, h);
            } else {
                h = 0;
            }
            cur = arr[i];
        }

        System.out.println(answer);
    }
}