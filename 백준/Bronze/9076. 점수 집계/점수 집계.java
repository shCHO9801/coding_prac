import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int[] arr = new int[5];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int sum = 0;
            if(arr[3]-arr[1] >= 4)
                System.out.println("KIN");
            else {
                for (int i = 1; i < arr.length - 1; i++) {
                    sum += arr[i];
                }
                System.out.println(sum);
            }
        }
    }
}