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
        int m = in.nextInt();
        int answer = 0, min = -1;
        for(int i=n;i<=m;i++){
            if(isPrime(i)){
                if(min == -1) min = i;
                answer+=i;
            }
        }
        if(answer != 0)
            System.out.println(answer);
        System.out.println(min);
    }
}