import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n-1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            space--;
            System.out.println();
        }
    }
}