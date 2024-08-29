import java.util.*;
import java.io.*;

public class Main {
    public static boolean is666(int n){
        while(n >= 100){
            if(n % 1000 == 666){
                return true;
            }
            n /= 10;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cur = 666;
        int num = 1;
        while(num != n){
            cur++;
            if(is666(cur)){
                num++;
            }
        }
        System.out.println(cur);
    }
}