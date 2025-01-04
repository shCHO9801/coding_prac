import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int answer = 0;

        for(int i = x; i >= 1; i--) {
            String val = String.valueOf(i);
            if(func(toIntArray(val))) {
                answer++;
            }
        }
        System.out.println(answer);
    }

    private static int[] toIntArray(String s) {
        char[] cArr = s.toCharArray();
        int[] result = new int[cArr.length];

        for(int i = 0; i < cArr.length; i++) {
            result[i] = cArr[i] - '0';
        }

        return result;
    }

    private static boolean func (int[] arr) {
        if(arr.length <= 2) {
            return true;
        }

        int diff = arr[1] - arr[0];

        for (int i = 2; i < arr.length; i++) {
            if(diff != arr[i] - arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}