import java.util.*;

public class Main {
    static int[] memo = new int[21];
    public static Integer fibo(Integer n) {
        if(n == 0) return 0;
        if(n == 1 || n == 2) {
            return memo[n] = 1;
        }
        if(memo[n] != 0) {
            return memo[n];
        }

        return memo[n] = fibo(n - 2) + fibo(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
}