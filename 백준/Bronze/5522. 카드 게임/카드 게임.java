import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int answer = 0;
        while(n-->0){
            int x = sc.nextInt();
            answer+=x;
        }
        System.out.println(answer);
    }
}