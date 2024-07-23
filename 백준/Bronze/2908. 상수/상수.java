import java.math.BigInteger;
import java.util.*;
public class Main {
    public static String reverse(String s){
        String tmp = "";
        for(int i = s.length()-1;i >= 0; i--)
            tmp+=s.charAt(i);
        return tmp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String r_a = reverse(a);
        String r_b = reverse(b);
        int answer = Integer.parseInt(r_a)>Integer.parseInt(r_b)?Integer.parseInt(r_a):Integer.parseInt(r_b);
        System.out.println(answer);
    }
}