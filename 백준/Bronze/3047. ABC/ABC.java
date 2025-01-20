import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        String s = br.readLine();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int tmp = s.charAt(i) - 'A';
            answer.append(arr[tmp]).append(' ');
        }

        System.out.println(answer);
    }
}