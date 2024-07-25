import java.util.*;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        while(n-->0){
            double x = in.nextDouble();
            String[] token = in.nextLine().split(" ");
            for(String tmp : token){
                if(tmp.isEmpty())
                    continue;
                if(tmp.equals("@"))
                    x*=3;
                if(tmp.equals("%"))
                    x+=5;
                if(tmp.equals("#"))
                    x-=7;
            }
            System.out.printf("%.2f\n", x);
        }
    }
}