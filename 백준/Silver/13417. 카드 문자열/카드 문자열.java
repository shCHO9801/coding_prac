import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringTokenizer st;

    private static String solution(int n) {
        StringBuilder result = new StringBuilder();
        Deque<Character> dq = new ArrayDeque<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.add(st.nextToken().charAt(0));
        }

        dq.addLast(queue.poll());

        while(!queue.isEmpty()) {
            char cur = queue.poll();

            if(dq.peekFirst() < cur) {
                dq.addLast(cur);
            } else {
                dq.addFirst(cur);
            }
        }

        while(!dq.isEmpty()) {
            result.append(dq.pollFirst());
        }

        return result.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            answer.append(solution(n)).append('\n');
        }
        System.out.println(answer);
    }
}