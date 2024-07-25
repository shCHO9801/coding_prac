import java.util.*;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        long a = in.nextLong();
        long b = in.nextLong();
        if(a>b){
            long tmp = a;
            a = b;
            b = tmp;
        }
        if(a==b)
            System.out.println(0);
        else {
            System.out.println(b - a - 1);
            for (long i = a + 1; i < b; i++) {
                System.out.print(i + " ");
            }
        }
    }
}