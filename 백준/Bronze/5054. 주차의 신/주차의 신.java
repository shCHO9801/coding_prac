import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int answer = 0;
            int n = sc.nextInt();
            int max = -1, min = 100;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                max = Math.max(max, x);
                min = Math.min(min,x);
            }

            System.out.println((max-min)*2);
        }
    }
}