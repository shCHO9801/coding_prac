import java.util.*;
import java.io.*;

public class Main {
    public static int f(int n){
        int result = n;
        while(n != 0){
            result += n % 10;
            n /= 10;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        int cnt = 1;
        while (cnt < n){
            int tmp = f(cnt);
            if(tmp == n){
                answer = cnt;
                break;
            }
            cnt+=1;
        }
        System.out.println(answer);
    }
}