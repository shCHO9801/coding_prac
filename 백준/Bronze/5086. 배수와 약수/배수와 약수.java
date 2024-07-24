import java.util.*;
public class Main {
    public static String answer(int a, int b){
        if(a%b==0)
            return "multiple";
        if(b%a==0)
            return "factor";
        return "neither";
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            int a = in.nextInt();
            int b = in.nextInt();
            if(a == 0 && b== 0)
                break;
            System.out.println(answer(a,b));
        }
    }
}