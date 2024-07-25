import java.util.*;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static int[] makeCard(int n, int[] arr){
        while(n-->0){
            int a = in.nextInt();
            int b = in.nextInt();
            Stack<Integer> st = new Stack<>();
            for (int i = a; i <= b; i++) {
                st.add(arr[i]);
            }
            for (int i = a; i <= b; i++) {
                arr[i] = st.pop();
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[21];
        for (int i = 0; i < 21; i++) {
            arr[i] = i;
        }
        int n = 10;
        int[] answer = makeCard(n, arr);
        for (int i = 1; i < 21; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}