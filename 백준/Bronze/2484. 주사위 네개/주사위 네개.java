import java.nio.Buffer;
import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st;
    static int[] answer;
    static int max;
    static int diceValue(int[] dice){
        Arrays.sort(dice);
        if(dice[0] == dice[3])
            return 50000+dice[0]*5000;
        if(dice[0] == dice[2] || dice[1] == dice[3])
            return 10000 + dice[2]*1000;
        if(dice[0] == dice[1] && dice[2] == dice[3])
            return 2000+dice[0] * 500 + dice[2] * 500;
        if(dice[0] == dice[1] || dice[1] == dice[2])
            return 1000 + dice[1]*100;
        if(dice[2] == dice[3])
            return 1000 + dice[2]*100;
        return dice[3] * 100;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        answer = new int[n];
        while(n-->0){
            int[] dice = new int[4];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 4; i++) {
                dice[i] = Integer.parseInt(st.nextToken());
            }
            max = Math.max(max, diceValue(dice));
        }
        System.out.println(max);
    }
}