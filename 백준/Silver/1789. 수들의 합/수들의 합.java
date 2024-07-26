import java.util.*;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        long s = in.nextLong();
        long sum = 0;
        int count = 0;
        for(int i=1;;i++){
            if(sum>s) break;
            sum+=i;
            count++;
        }
        System.out.println(--count);
    }
}