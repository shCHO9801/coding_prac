import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int count = 0;
    static StringBuilder answer;

    private static void addAnswer(int n1, int n2) {
        count++;
        answer.append(n1).append(" ").append(n2).append("\n");
    }

    private static void hanoi(int n, int start, int tmp, int to) {
        if (n == 1) {
            addAnswer(start, to);
            return;
        }

        hanoi(n - 1, start, to, tmp);
        addAnswer(start, to);
        hanoi(n - 1, tmp, start, to);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        answer = new StringBuilder();
        int k = Integer.parseInt(br.readLine());
        hanoi(k, 1, 2, 3);
        System.out.println(count + "\n" + answer);
    }
}