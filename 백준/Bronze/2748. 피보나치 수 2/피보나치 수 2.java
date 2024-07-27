import java.util.*;
import java.io.*;
public class Main{
    static long[] memo;
    static int n;
    public static long fibo(int n){
        if(n==0) return 0;
        if(n<=2) return 1;
        memo = new long[n+1];
        memo[1] = memo[2] = 1;
        for (int i = 3; i <= n; i++) {
            memo[i] = memo[i-1] + memo [i-2];
        }
        return memo[n];
    }
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        long answer = fibo(n);
        System.out.println(answer);
    }

}