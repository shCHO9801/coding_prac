import java.util.*;
import java.io.*;
public class Main{
    static int t;
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int max = 0, max_i = 0;
        for (int i = 1; i <= 5; i++) {
            int answer = 0;
            for (int j = 0; j < 4; j++) {
                int x = sc.nextInt();
                answer+=x;
            }
            if(max < answer){
                max = answer;
                max_i = i;
            }
        }
        System.out.printf("%d %d",max_i, max);
    }
}