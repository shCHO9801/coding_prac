import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        while(n >= 4) {
            if(fun(n)) {
                System.out.println(n);
                break;
            }
            n--;
        }
    }

    private static boolean fun(int n) {
        Set<Character> set = new TreeSet<>();
        for (char c : String.valueOf(n).toCharArray()) {
            set.add(c);
            if(set.size() > 2) {
                return false;
            }
        }
        int[] arr = set.stream().mapToInt(x -> x - '0').sorted().toArray();

        if(arr.length == 2) {
            if(arr[0] == 4 && arr[1] == 7) return true;
        }
        return arr.length == 1 && (arr[0] == 4 || arr[0] == 7);
    }
}