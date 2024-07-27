import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int train = 0;
        int max = 0;
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            train += b-a;
            max = Math.max(max,train);
        }
        System.out.println(max);
    }
}