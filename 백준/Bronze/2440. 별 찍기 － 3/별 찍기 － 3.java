import java.util.*;
public class Main {
    static Scanner in = new Scanner(System.in);
        public static void main(String[] args) {
        int n = in.nextInt();
        int star = n;
        while (n-->0){
            star = n+1;
            while(star-->0)
                System.out.print('*');
            System.out.println();
        }
    }
}