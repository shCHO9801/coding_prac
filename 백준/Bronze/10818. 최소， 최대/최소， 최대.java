import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max_v = 0, min_v = 0;
        for(int i = 0;i<n;i++){
            int x = sc.nextInt();
            if(i==0){
                max_v = x;
                min_v = x;
                continue;
            }
            if(max_v < x)
                max_v = x;
            if(min_v > x)
                min_v = x;
        }
        System.out.println(min_v + " " + max_v);
    }
}