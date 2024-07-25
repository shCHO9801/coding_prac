import java.util.*;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        int m = in.nextInt();
        int answer = (n-1) + n * (m-1);
        System.out.println(answer);
    }
}