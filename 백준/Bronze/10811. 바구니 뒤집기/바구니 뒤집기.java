import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = i+1;
        while(m-->0){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int[] tmp = new int[j-i+1];
            int idx = 0;
            for (int k = j-1; k >= i-1 ; k--) {
                tmp[idx++] = arr[k];
            }
            for (int k = j-1; k >= i-1 ; k--){
                arr[k] = tmp[--idx];
            }

        }
        for(int num : arr)
            System.out.print(num + " ");
    }
}