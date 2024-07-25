import java.util.*;
public class Main {
    static Scanner in = new Scanner(System.in);
        public static void main(String[] args) {
        int n = in.nextInt();
        int space = 0;
        while (n-->0){
            int star = n+1;
            for (int i = 0; i < space; i++) 
                System.out.print(' ');
            while(star-->0)
                System.out.print('*');
            System.out.println();
            space++;
        }
    }
}