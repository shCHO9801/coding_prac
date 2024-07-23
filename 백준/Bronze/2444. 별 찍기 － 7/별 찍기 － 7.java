import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int star = 1;
        int space = n-1;
        for (int i = 1; i <= 2*n-1; i++) {
            for (int j = 0; j < space; j++)
                System.out.print(' ');
            for (int j = 0; j < star; j++)
                System.out.print('*');
            if(i < n){
                star+=2;space--;
            }
            else{
                star-=2;space++;
            }
            System.out.println();
        }
    }
}