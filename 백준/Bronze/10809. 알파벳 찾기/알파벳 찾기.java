import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alpa = new int[26];
        String s = sc.next();
        for (int i = 0; i < 26; i++) {
            alpa[i] = -1;
        }
        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i)-'a';
            if(alpa[x] == -1)
                alpa[x] = i;
        }
        for(int answer : alpa) {
            System.out.print(answer + " ");
        }

    }
}