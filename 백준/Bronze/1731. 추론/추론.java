import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int answer;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int diff = arr[1] - arr[0];
        if(arr[2] - arr[1] == diff) {
            answer = arr[n - 1] + diff;
        } else {
            answer = arr[n - 1] * (arr[1] / arr[0]);
        }

        System.out.println(answer);

    }
}