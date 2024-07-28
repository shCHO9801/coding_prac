import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int space = n-1;
        for (int i = 1; i <= n; i++) {
            if(i == 1){
                for (int j = 0; j < space; j++) {
                    System.out.print(' ');
                }
                System.out.println('*');
                space--;
                continue;
            }
            if(i==n){
                for (int j = 0; j < 2*n-1; j++) {
                    System.out.print('*');
                }
                continue;
            }
            for (int j = 0; j < space; j++) {
                System.out.print(' ');
            }
            System.out.print('*');
            for (int j = 0; j < 2*(i-1)-1; j++) {
                System.out.print(' ');
            }
            System.out.println('*');
            space--;
        }
    }
}