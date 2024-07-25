import java.util.*;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int x = in.nextInt();
            if(x<40) x = 40;
            sum+=x;
        }
        System.out.println(sum/5);
    }
}