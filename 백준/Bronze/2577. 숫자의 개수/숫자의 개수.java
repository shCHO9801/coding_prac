import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] count = new int[10];
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        String mul = (a*b*c) + "";
        for (int i = 0; i < mul.length(); i++) {
            int tmp = Integer.parseInt(mul.charAt(i)+"");
            count[tmp]++;
        }
        for(int i : count)
            System.out.println(i);
    }
}