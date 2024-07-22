import java.util.*;
public class Main {
    public static void main(String[] args) {
        String s = "";
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b) s = "==";
        if(a>b) s = ">";
        if(a<b) s = "<";
        System.out.println(s);
    }
}