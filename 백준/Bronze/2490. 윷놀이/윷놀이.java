import java.util.*;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static char score(int x){
        x = 4-x;
        switch (x){
            case 0:
                return 'E';
            case 1:
                return 'A';
            case 2:
                return 'B';
            case 3:
                return 'C';
            case 4:
                return 'D';
        }
        return 'x';
    }
    public static void main(String[] args) {
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                int x = in.nextInt();
                sum+=x;
            }
            arr[i] = sum;
        }
        for(int x : arr)
            System.out.println(score(x));
    }
}