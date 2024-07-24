import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int idx = 2;
        while(idx<=n){
            while(n%idx==0){
                System.out.println(idx);
                n/=idx;
            }
            idx++;
        }
    }
}