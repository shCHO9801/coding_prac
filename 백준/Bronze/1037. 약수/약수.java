import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(arr[i],max);
            min = Math.min(arr[i],min);
        }
        int tmp = max*min;
        while(true){
            boolean ismul = false;
            for (int i = 0; i < n; i++) {
                if(tmp%arr[i] != 0) {
                    ismul = true;
                    break;
                }
            }
            if(ismul)
                tmp++;
            else break;
        }
        System.out.println(tmp);
    }
}