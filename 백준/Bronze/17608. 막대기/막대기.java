import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            stack.push(Integer.parseInt(br.readLine()));
        }

        int max = 0;
        while (!stack.isEmpty()) {
            int cur = stack.pop();
            if (cur > max) {
                max = cur;
                answer++;
            }
        }

        System.out.println(answer);
    }
}