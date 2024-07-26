import java.util.*;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int k = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        if(m>=k*n)
            System.out.println(0);
        else{
            System.out.println(k*n-m);
        }
    }
}