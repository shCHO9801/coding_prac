import java.util.*;
import java.io.*;

public class Main{
    static StringTokenizer st;
    public static int tokenReturn(){
        return Integer.parseInt(st.nextToken());
    }
    public static void main (String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        int n = tokenReturn();
        int m = tokenReturn();

        int[][] arr = new int[n + 1][n + 1];
        int[][] sumArr = new int[n + 1][n + 1];

        for(int i = 1; i < n + 1; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < n + 1; j++){
                arr[i][j] = tokenReturn();
            }
        }

        for(int i = 1; i < n + 1; i++){
            for (int j = 1; j < n + 1; j++){
                sumArr[i][j] = sumArr[i - 1][j] + sumArr[i][j - 1] - sumArr[i - 1][j - 1] + arr[i][j];
            }
        }

        while(m-- > 0){
            st = new StringTokenizer(br.readLine());
            int x1 = tokenReturn();
            int y1 = tokenReturn();
            int x2 = tokenReturn();
            int y2 = tokenReturn();

            int sum = sumArr[x2][y2] - sumArr[x1 - 1][y2] - sumArr[x2][y1 - 1] + sumArr[x1 - 1][y1 - 1];
            answer.append(sum).append('\n');
        }

        System.out.println(answer.toString());
    }
}