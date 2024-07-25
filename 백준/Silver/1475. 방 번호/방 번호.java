import java.util.*;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static int[] count_num(int n){
        int[] count = new int[9];
        while(n>0){
            int tmp = n%10;
            if(tmp == 9) tmp = 6;
            count[tmp]++;
            n/=10;
        }
        count[6] = count[6]%2==0?count[6]/2:count[6]/2+1;
        return count;
    }
    public static int find_max(int[] arr){
        int max_val = 0;
        for(int i : arr)
            max_val = Math.max(max_val, i);
        return max_val;
    }
    public static void main(String[] args) {
        int n = in.nextInt();
        int[] count = count_num(n);
        int answer = find_max(count);
        System.out.println(answer);
    }
}