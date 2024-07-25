import java.util.*;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        C+=D;
        B += C/60;
        C %=60;
        A += B/60;
        B %= 60;
        if(A >= 24)
            A%=24;
        System.out.printf("%d %d %d", A, B, C);
    }
}