import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[31];
        int n = 28;
        while(n-->0){
            int x = sc.nextInt();
            arr[x] = 1;
        }
        for(int i=1;i<=30;i++)
            if(arr[i]==0)
                System.out.println(i);
    }
}