import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder answer = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (cnt < n) {
            queue.add(++cnt);
        }

        while (queue.size() > 1) {
            answer.append(queue.poll()).append(' ');
            queue.add(queue.poll());
        }

        answer.append(queue.poll());

        System.out.println(answer);
    }
}