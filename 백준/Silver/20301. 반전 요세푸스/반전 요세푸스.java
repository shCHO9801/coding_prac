import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        Deque<Integer> dq = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;
        boolean reverse = false;

        for (int i = 1; i <= n; i++) {
            dq.addLast(i);
        }

        while (dq.peekFirst() != k) {
            dq.addLast(dq.pollFirst());
        }

        while (!dq.isEmpty()) {
            count++;
            if (!reverse) {
                answer.append(dq.pollFirst()).append('\n');
            } else {
                answer.append(dq.pollLast()).append('\n');
            }
            if (dq.isEmpty()) break;

            if (count == m) {
                reverse = !reverse;
                count = 0;
            }

            if (!reverse) {
                for (int i = 0; i < k - 1; i++) {
                    dq.addLast(dq.pollFirst());
                }
            } else {
                for (int i = 0; i < k - 1; i++) {
                    dq.addFirst(dq.pollLast());
                }
            }
        }


        System.out.println(answer);
        br.close();
    }
}