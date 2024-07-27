import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            answer+=x;
        }
        System.out.println(answer-(n-1));
    }
}