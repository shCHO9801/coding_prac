import java.util.*;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            sum+=arr[i];
        }
        Arrays.sort(arr);
        System.out.println(sum/n);
        System.out.println(arr[n/2]);
    }
}