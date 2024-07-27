import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        int i,j;
        i = j =0;
        for (i = 0; i < arr.length-1; i++) {
            boolean flag = false;
            for (j = i+1; j < arr.length; j++) {
                if(100 == sum-arr[i]-arr[j]) {
                    flag = true;
                    break;
                }
            }
            if(flag) break;
        }
        for (int k = 0; k < arr.length; k++) {
            if(k==i || k==j) continue;
            System.out.println(arr[k]);
        }
    }
}