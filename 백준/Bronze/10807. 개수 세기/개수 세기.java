import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int count = 0, x;
        x = sc.nextInt();
        for(int num : arr)
            if(num == x)
                count++;
        System.out.println(count);
    }
}