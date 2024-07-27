import java.util.*;
import java.io.*;
public class Main{
    public static int fibo(int n){
        if(n==0) return 0;
        if(n<3) return 1;
        int[] arr = new int[n+1];
        arr[1] = arr[2] = 1;
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
}