import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        while(n-- > 0) {
            String name = br.readLine();
            answer.append(name).append(" is ");

            name = name.toLowerCase();
            int g = 0;
            int b = 0;

            for (int i = 0; i < name.length(); i++) {
                if(name.charAt(i) == 'g') g++;
                if(name.charAt(i) == 'b') b++;
            }

            if(g == b) {
                answer.append("NEUTRAL");
            } else if(g > b) {
                answer.append("GOOD");
            } else {
                answer.append("A BADDY");
            }
            answer.append('\n');
        }

        System.out.println(answer);
    }
}