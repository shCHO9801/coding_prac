import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;
        int n =Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int x = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int l = 0;
        int r = arr.length - 1;

        while(l < r) {
            int tmp = arr[l] + arr[r];
            if(x < tmp) {
                r--;
            } else if (x > tmp) {
                l++;
            } else {
                answer++;
                r--;
            }
        }

        System.out.println(answer);
    }
}