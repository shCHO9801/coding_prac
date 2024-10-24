import java.util.*;
import java.io.*;

public class Main {
    public static String isPangram(int[] alpha) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < alpha.length; i++) {
            if(alpha[i] == 0) {
                result.append((char)(i + 'a'));
            }
        }

        return result.length() == 0 ? "pangram" : "missing " + result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        while(n-- > 0) {
            String s = br.readLine();
            s = s.toLowerCase();

            int[] alpha = new int[26];
            for(char c : s.toCharArray()) {
                if(Character.isLowerCase(c)) {
                    alpha[c - 'a']++;
                }
            }

            answer.append(isPangram(alpha)).append('\n');
        }

        System.out.println(answer);
    }
}