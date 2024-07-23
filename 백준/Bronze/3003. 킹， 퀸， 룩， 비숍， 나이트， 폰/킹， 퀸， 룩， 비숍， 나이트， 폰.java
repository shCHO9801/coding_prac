import java.util.*;
public class Main {
    public static int[] chess = {1,1,2,2,2,8};
    static int chess_len = chess.length;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[chess.length];
        for (int i = 0; i < chess_len; i++) {
            arr[i] = in.nextInt();
            System.out.print((chess[i] - arr[i]) +" ");
        }
    }
}