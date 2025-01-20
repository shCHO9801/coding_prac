import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String val;

        List<Integer> num = new ArrayList<>();
        List<Character> cul = new ArrayList<>();

        while(!(val = br.readLine()).equals("=")) {
            if(Character.isDigit(val.charAt(0))) {
                num.add(Integer.valueOf(val));
            } else {
                cul.add(val.charAt(0));
            }
        }

        int answer = num.get(0);

        for (int i = 0; i < cul.size(); i++) {
            if(cul.get(i) == '+') {
                answer += num.get(i + 1);
            } else if (cul.get(i) == '-') {
                answer -= num.get(i + 1);
            } else if (cul.get(i) == '*') {
                answer *= num.get(i + 1);
            } else {
                answer = answer / num.get(i + 1);
            }
        }

        System.out.println(answer);

    }
}