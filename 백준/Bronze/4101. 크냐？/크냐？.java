import java.util.*;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int a,b;
        while(true){
            a = in.nextInt();
            b = in.nextInt();
            if(a==0 && b==0) break;
            System.out.println(a>b?"Yes":"No");
        }
    }
}