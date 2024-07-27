import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  star = 1;
        for (int i = 0; i < n*2-1; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print('*');
            }
            if(i<n-1) star++;
            else star--;
            System.out.println();
        }
    }
}