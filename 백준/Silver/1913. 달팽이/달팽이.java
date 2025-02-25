import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int find = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];
        int si = 0;
        int sj = 0;
        int ei = n - 1;
        int ej = n - 1;

        int cnt = n * n;
        while(true) {
            for(int i = si; i <= ei; i++) {
                arr[i][sj] = cnt--;
            }
            sj++;
            if(cnt <= 0) break;

            for(int j = sj; j <= ej; j++) {
                arr[ei][j] = cnt--;
            }
            ei--;
            if(cnt <= 0) break;

            for(int i = ei; i >= si; i--) {
                arr[i][ej] = cnt--;
            }
            ej--;
            if(cnt <= 0) break;

            for(int j = ej; j >= sj; j--) {
                arr[si][j] = cnt--;
            }
            si++;
            if(cnt <= 0) break;
        }

        int findX, findY;
        findX = findY = 9999;
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                answer.append(arr[i][j])
                        .append(' ');
                if(arr[i][j] == find) {
                    findX = i + 1;
                    findY = j + 1;
                }
            }
            answer.append('\n');
        }
        answer.append(findX)
                .append(' ')
                .append(findY);

        System.out.println(answer);
    }
}