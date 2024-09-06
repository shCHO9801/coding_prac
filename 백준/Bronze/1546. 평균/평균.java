import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = Integer.MIN_VALUE;
        int[] arr = new int[N];
        float average = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            M = Math.max(M, arr[i]);
        }

        for(int i : arr){
            average += (float) i / M * 100;
        }

        System.out.println(average / N);
    }
}