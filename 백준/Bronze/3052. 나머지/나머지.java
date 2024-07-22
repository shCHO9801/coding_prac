import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[42];
        int n = 10, count = 0;
        while(n-->0){
            int x = sc.nextInt();
            arr[x%42] = 1;
        }
        for(int i=0;i<=41;i++)
            if(arr[i]!=0)
                count++;
        System.out.println(count);
    }
}