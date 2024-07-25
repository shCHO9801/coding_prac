import java.util.*;
public class Main {
    static Scanner in = new Scanner(System.in);
        public static void main(String[] args) {
        int n = in.nextInt();
        int space = n-1;
        int star = 1;
        while(n-->0){
            int a = space;
            int b = star;
            while(a-->0)
                System.out.print(' ');
            while(b-->0)
                System.out.print('*');
            System.out.println();
            space--;
            star+=2;
        }
    }
}