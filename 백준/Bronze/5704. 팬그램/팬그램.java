import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        while(true) {
            String s = br.readLine();
            String result = "Y";
            if(s.equals("*")) break;
            int[] alpha = new int[26];
            for(char c : s.toCharArray()) {
                if(c == ' ') continue;
                alpha[c - 'a']++;
            }

            for(int i : alpha) {
                if (i == 0) {
                    result = "N";
                    break;
                }
            }
            answer.append(result).append('\n');
        }

        System.out.println(answer);
    }
}