import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        int[][] arr = new int[101][101];
        int t = 4;

        while(t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            
            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    arr[x][y] = 1;
                }
            }
        }

        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                if(arr[i][j] == 1) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}