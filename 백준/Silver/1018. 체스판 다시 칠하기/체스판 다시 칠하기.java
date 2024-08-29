import java.util.*;
import java.io.*;
import java.nio.*;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = Integer.MAX_VALUE;
        char[][] checkA = new char[8][8];
        char[][] checkB = new char[8][8];
        String a = "WBWBWBWB";
        String b = "BWBWBWBW";

        for (int i = 0; i < checkA.length; i++) {
            String tmp = a;
            if(i % 2 == 1){
                tmp = b;
            }
            for (int j = 0; j < 8; j++) {
                checkA[i][j] = tmp.charAt(j);
            }
        }

        for (int i = 0; i < checkA.length; i++) {
            String tmp = b;
            if(i % 2 == 1){
                tmp = a;
            }
            checkB[i] = tmp.toCharArray();
        }

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] board = new char[n][m];
        for(int i = 0; i < n; i++){
            String s = br.readLine();
            for(int j = 0; j < m; j++){
                board[i][j] = s.charAt(j);
            }
        }

        for(int i = 0; i < n - 7; i++){
            for(int j = 0; j < m - 7; j++){
                int cntA = 0;
                int cntB = 0;
                for(int x = 0; x < 8; x++){
                    for(int y = 0; y < 8; y++){
                        if(checkA[x][y] != board[x + i][y + j]){
                            cntA++;
                        }
                        if(checkB[x][y] != board[x + i][y + j]){
                            cntB++;
                        }
                    }
                }
                int min = Math.min(cntA, cntB);
                answer = Math.min(min, answer);
            }
        }
        System.out.println(answer);
    }
}