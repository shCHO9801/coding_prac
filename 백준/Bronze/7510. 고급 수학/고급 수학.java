import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            answer.append("Scenario #")
                    .append(i)
                    .append(":\n");

            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[3];

            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            if(isTriangle(arr[0], arr[1], arr[2])){
                answer.append("yes\n");
            } else {
                answer.append("no\n");
            }
            answer.append('\n');
        }

        System.out.println(answer);
    }

    private static boolean isTriangle(int a, int b, int c) {
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
    }
}