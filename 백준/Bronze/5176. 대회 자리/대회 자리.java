import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int p = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[m+1];
            int answer = 0;
            while(p-->0){
                int x = sc.nextInt();
                if(arr[x] != 0) answer++;
                else arr[x] = 1;
            }
            System.out.println(answer);
        }
    }
}