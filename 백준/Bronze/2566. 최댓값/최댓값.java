import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max_val = -1, max_i = 0, max_j = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int n = in.nextInt();
                if(n > max_val) {
                    max_val = n;
                    max_i = i;
                    max_j = j;
                }
            }
        }
        System.out.println(max_val);
        System.out.print(max_i + " " + max_j);
    }
}