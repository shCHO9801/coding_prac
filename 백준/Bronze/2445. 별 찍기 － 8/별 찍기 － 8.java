import java.util.*;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void draw_star(int star){
        for (int j = 0; j < star; j++) {
            System.out.print('*');
        }
    }
    public static void draw_space(int space){
        for (int j = 0; j < space; j++) {
            System.out.print(' ');
        }
    }
    public static void main(String[] args) {
        int n = in.nextInt();
        int star = 1;
        int space = 2*n-2;
            for (int i = -n+1; i <= n-1; i++) {
                draw_star(star);
                draw_space(space);
                draw_star(star);
                if(i<0) {
                    star++;
                    space-=2;
                }
                else{
                    star--;
                    space+=2;
                }
                System.out.println();
            }
    }
}