import java.util.*;
import java.io.*;
public class Main{
    public static void print_answer(int a, int b){
        System.out.printf("You get %d piece(s) and your dad gets %d piece(s).\n",a,b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int a = sc.nextInt();
            int b= sc.nextInt();
            print_answer(a/b, a%b);
        }
    }
}