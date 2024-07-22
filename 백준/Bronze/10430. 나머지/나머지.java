import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int[] answer = new int[4];
        answer[0] = (A+B)%C;
        answer[1] = ((A%C) + (B%C))%C;
        answer[2] = (A*B)%C;
        answer[3] = ((A%C) * (B%C))%C;
        for(int v : answer)
            System.out.println(v);
    }
}