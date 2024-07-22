import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,x;
        n = sc.nextInt();
        x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int in = sc.nextInt();
            if(in<x)
                System.out.print(in + " ");
        }
    }
}