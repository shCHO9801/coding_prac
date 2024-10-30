import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int top = 1;
        Stack<Integer> trick = new Stack<>();
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder answer = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            trick.push(Integer.parseInt(st.nextToken()));
        }

        while(!trick.isEmpty()) {
            int curTrick = trick.pop();

            if(curTrick == 1) {
                deque.addFirst(top++);
            } else if (curTrick == 2) {
                int t = deque.removeFirst();
                deque.addFirst(top++);
                deque.addFirst(t);
            } else {
                deque.addLast(top++);
            }
        }
        while(!deque.isEmpty()) {
            answer.append(deque.pollFirst() + " ");
        }
        System.out.println(answer);
    }
}