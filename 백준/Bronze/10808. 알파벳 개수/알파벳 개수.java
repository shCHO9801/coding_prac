import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            int tmp = s.charAt(i) - 'a';
            arr[tmp]++;
        }
        for(int n : arr)
            System.out.print(n + " ");
    }
}