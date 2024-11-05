import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder answer;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        answer = new StringBuilder();
        int k = Integer.parseInt(br.readLine());

        hanoi(k, 1, 2, 3);
        System.out.println(count + "\n" + answer);
    }

    private static void hanoi(int n, int start, int mid, int end) {
        if (n == 1) {
            // start -> end
            addAnswer(start, end);
            return;
        }
        hanoi(n - 1, start, end, mid);
        // start -> end
        addAnswer(start, end);
        hanoi(n - 1, mid, start, end);
    }

    private static void addAnswer(int start, int end) {
        count++;
        answer.append(start).append(" ").append(end).append("\n");
    }
}