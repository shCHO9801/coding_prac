import java.util.*;
public class Main {
    public static String changeChar(char[] arr){
        String tmp = "";
        for (char x : arr) {
            tmp+=x;
        }
        return tmp;
    }
    public static boolean isPossible(String a, String b){
        if(a.equals(b))
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n-- > 0){
            char[] a = (in.next()).toCharArray();
            char[] b = (in.next()).toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            String sort_a = changeChar(a);
            String sort_b = changeChar(b);
            if(isPossible(sort_a,sort_b))
                System.out.println("Possible");
            else
                System.out.println("Impossible");
        }
    }
}