import java.math.BigInteger;
import java.util.*;
public class Main {
    public static int find_num(char x){
        if("ABC".contains(x+""))
            return 3;
        if("DEF".contains(x+""))
            return 4;
        if("GHI".contains(x+""))
            return 5;
        if("JKL".contains(x+""))
            return 6;
        if("MNO".contains(x+""))
            return 7;
        if("PQRS".contains(x+""))
            return 8;
        if("TUV".contains(x+""))
            return 9;
        return 10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        String s = sc.next();
        for(int i = 0; i<s.length();i++){
            answer += find_num(s.charAt(i));
        }
        System.out.println(answer);
    }
}