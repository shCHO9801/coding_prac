import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long answer = 0;
        String s = br.readLine();
        long mul = 1;
        
        for(int i = s.length() - 1; i >= 0; i--) {
            char tmp = s.charAt(i);
            if(Character.isUpperCase(tmp)) {
                answer += (tmp - 'A' + 10) * mul;
            } else {
                answer += (tmp - '0') * mul;
            }
            mul *= 16;
        }

        System.out.println(answer);
    }
}