import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int space = N-1;
        int star = 1;
        for(int i=0;i<N;i++){
            for(int j = 0;j<space;j++)
                System.out.print(' ');
            for(int j=0;j<star;j++)
                System.out.print('*');
            space--;star++;
            System.out.println();
        }
    }
}