import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int v = sc.nextInt();
            int e = sc.nextInt();
            System.out.println(2-(v-e));
        }
    }
}