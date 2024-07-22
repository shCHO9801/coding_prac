import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int n = sc.nextInt();
        arr = new int[n];
        int m = sc.nextInt();

        while(m-->0){
            int i,j,k;
            i = sc.nextInt();
            j = sc.nextInt();
            k = sc.nextInt();
            for(int l = i;l<=j;l++)
                arr[l-1] = k;
        }
        for(int b : arr)
            System.out.print(b + " ");
    }
}