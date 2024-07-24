import java.util.*;
public class Main {
    public static boolean isPrime(int n){
        if(n < 2)
            return false;
        int i = 2;
        for(;i<n;i++){
            if(n%i==0)
                break;
        }
        if(i==n)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int answer = 0;
        while(n-->0){
            int x = in.nextInt();
            if(isPrime(x))
                answer++;
        }
        System.out.println(answer);
    }
}