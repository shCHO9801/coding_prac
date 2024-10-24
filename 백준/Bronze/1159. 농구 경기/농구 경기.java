import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] alpha = new char[26];
        int n = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        while(n-- > 0) {
            String s = br.readLine();
            alpha[s.charAt(0) - 'a']++;
        }

        for (int i = 0; i < alpha.length; i++) {
            if(alpha[i] >= 5) {
                answer.append((char) (i + 'a'));
            }
        }

        System.out.println(answer.length() == 0 ? "PREDAJA" : answer);
    }
}