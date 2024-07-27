import java.util.*;
import java.io.*;
public class Main{
    static int t;
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            for (int i = 0; i < s.length(); i++) {
                if(i+1 == n)
                    continue;
                System.out.print(s.charAt(i));
            }
            System.out.println();
        }
    }
}