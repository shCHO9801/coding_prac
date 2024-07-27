import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String star = "* ";
        for (int i = 0; i < n; i++) {
            if(i%2==1) System.out.print(' ');
            for (int j = 0; j < n; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}