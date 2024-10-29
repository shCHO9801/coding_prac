import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    private static String reverseText(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        Stack<String> stack = new Stack<>();

        for (String st : s.split(" ")) {
            stack.push(st);
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop()).append(' ');
        }

        return result.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            answer.append("Case #").append(i).append(": ");

            String s = br.readLine();
            answer.append(reverseText(s));

            answer.append("\n");
        }

        System.out.println(answer);
    }
}