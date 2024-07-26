import java.util.*;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static int money(int[] arr){
        Arrays.sort(arr);
        if(arr[0] == arr[1] && arr[1] == arr[2])
            return 10000 + arr[1] * 1000;
        if(arr[0] == arr[1] || arr[1] == arr[2])
            return 1000 + arr[1] * 100;
        return arr[2] * 100;
    }
    public static void main(String[] args) {
        int t = in.nextInt();
        int answer = 0;
        while(t-->0){
            int[] arr = new int[3];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            answer = Math.max(answer, money(arr));
        }
        System.out.println(answer);
    }
}