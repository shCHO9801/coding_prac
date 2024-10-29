import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int problem = 0;

        while (true) {
            String s = br.readLine();
            if (s.equals("고무오리 디버깅 끝")) {
                break;
            } else if (s.equals("문제")) {
                problem++;
            } else if (s.equals("고무오리")) {
                if (problem > 0) {
                    problem--;
                } else {
                    problem += 2;
                }
            }
        }

        System.out.println(problem == 0 ? "고무오리야 사랑해" : "힝구");
    }
}