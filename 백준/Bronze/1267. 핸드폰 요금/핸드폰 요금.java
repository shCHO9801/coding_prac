import java.util.*;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        int[] arr = new int[n];
        int y = 0, m = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            y+=(arr[i]/30+1)*10;
            m+=(arr[i]/60+1)*15;
        }
        if(y<=m)
            System.out.print("Y ");
        if(m<=y)
            System.out.print("M ");
        System.out.println(Math.min(y,m));
    }
}