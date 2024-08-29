import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = -1;
        int i = 0;
        int j = 0;
        while(j * 3 <= n){
            if(i * 5 + j * 3 == n){
                answer = i + j;
                break;
            }
            i += 1;
            if(i * 5 > n){
                i = 0;
                j += 1;
            }
        }
        System.out.println(answer);
    }
}