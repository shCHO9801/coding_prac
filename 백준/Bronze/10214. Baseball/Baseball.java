import java.util.*;
import java.io.*;
public class Main {
    static StringTokenizer st;
    static int T, round;
    static String[] answer = {"Yonsei", "Korea","Draw"};
    static int[] score;
    public static String printWin(int a, int b){
        if(a==b) return answer[2];
        if(a>b) return answer[0];
        return answer[1];
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        while(T-->0){
            round = 9;
            score = new int[2];
            while(round-->0){
                st = new StringTokenizer(br.readLine());
                score[0] += Integer.parseInt(st.nextToken());
                score[1] += Integer.parseInt(st.nextToken());
            }
            System.out.println(printWin(score[0],score[1]));
        }
    }
}