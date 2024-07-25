import java.util.*;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = 9;
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            sum+=arr[i];
        }
        Arrays.sort(arr);
        int i = 0,j = 0;
        for (i = 0; i < n-1; i++) {
            boolean stop = false;
            for (j = 1; j < n; j++) {
                if(sum-arr[i]-arr[j] == 100){
                    stop = true;
                    break;
                }
            }
            if(stop)
                break;
        }
        for (int k = 0; k < n; k++) {
            if(k==i || k==j)
                continue;
            System.out.println(arr[k]);
        }
    }
}