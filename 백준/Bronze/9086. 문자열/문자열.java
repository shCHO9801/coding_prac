import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            String str = sc.next();
            int s = 0, e = str.length()-1;
            System.out.print(str.charAt(s));
            System.out.println(str.charAt(e));
        }
    }
}