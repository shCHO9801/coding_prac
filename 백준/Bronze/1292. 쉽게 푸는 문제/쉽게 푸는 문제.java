import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[b+1];
        int idx = 0;
        int num = 1;
        while(true){
            for (int i = 1; i <= num; i++) {
                if(idx>b) break;
                arr[idx++] = num;
            }
            if(idx>b) break;
            num++;
        }
        int answer = 0;
        for (int i = a-1; i < b; i++) {
            answer+=arr[i];
        }
        System.out.println(answer);
    }
}