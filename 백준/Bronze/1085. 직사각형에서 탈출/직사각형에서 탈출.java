import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt();
        w-=x;
        h-=y;
        int min = Math.min(x,y);
        min = Math.min(min,w);
        min = Math.min(min,h);
        System.out.println(min);
    }
}