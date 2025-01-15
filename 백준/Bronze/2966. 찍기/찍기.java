import java.io.*;
import java.util.*;

public class Main {
    static final String[] check = {"ABC", "BABC", "CCAABB"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int[] arr = new int[3];
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < check.length; j++) {
                if(check[j].charAt(i % check[j].length()) == s.charAt(i)) {
                    arr[j] += 1;
                    max = Math.max(arr[j], max);
                }
            }
        }
        answer.append(max).append('\n');

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == max) {
                if(i == 0) {
                    answer.append("Adrian\n");
                } else if (i == 1) {
                    answer.append("Bruno\n");
                } else {
                    answer.append("Goran");
                }
            }
        }

        System.out.println(answer);
    }
}