import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        while(n-- > 0) {
            String s = br.readLine();
            int x = s.charAt(s.length() - 1) - '0';
            answer.append(x % 2 == 0 ? "even" : "odd").append('\n');
        }

        System.out.println(answer);
    }
}