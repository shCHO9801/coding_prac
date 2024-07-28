import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int s = 0, t = 0;
        for (int i = 0; i < 4; i++) {
            int x = sc.nextInt();
            s+=x;
        }
        for (int i = 0; i < 4; i++) {
            int x = sc.nextInt();
            t+=x;
        }
        System.out.println(Math.max(s,t));
    }
}