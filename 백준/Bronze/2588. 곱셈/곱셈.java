import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int[] answer = new int[4];
        answer[3] = a*b;
        answer[0] = b%10 * a;
        b/=10;
        answer[1] = b%10 * a;
        b/=10;
        answer[2] = b%10 * a;
        for(int i=0; i<4; i++){
            System.out.println(answer[i]);
        }
    }
}