import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        int m = sc.nextInt();

        while(m-->0){
            int i,j;
            i = sc.nextInt();
            j = sc.nextInt();
            i--;j--;
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        for(int b : arr)
            System.out.print(b + " ");
    }
}