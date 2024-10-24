import java.util.*;

public class Main {
    public static Long mul(Long n) {
        if(n == 0) return 1L;
        if(n == 1) {
            return n;
        }
        return n * mul(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        System.out.println(mul(n));
    }
}