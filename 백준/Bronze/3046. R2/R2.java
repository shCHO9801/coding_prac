import java.util.*;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int R1 = in.nextInt();
        int S = in.nextInt();
        int R2 = S * 2 - R1;
        System.out.println(R2);
    }
}