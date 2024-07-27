import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                answer+=i+j;
            }
        }
        System.out.println(answer);
    }
}