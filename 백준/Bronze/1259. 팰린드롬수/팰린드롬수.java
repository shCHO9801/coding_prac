import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        while(true) {
            String s = br.readLine();
            if(s.equals("0")) {
                break;
            }
            if(isPalindrome(s.toCharArray())) {
                answer.append("yes\n");
            } else {
                answer.append("no\n");
            }
        }
        System.out.println(answer);
    }

    private static boolean isPalindrome(char[] cArr) {
        int l = 0;
        int r = cArr.length - 1;
        while(l < r) {
            if(cArr[l] != cArr[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}