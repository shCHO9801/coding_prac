import java.util.*;
import java.nio.*;
import java.io.*;

public class Main{
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        Deque<Integer> dq = new ArrayDeque<>();
        StringBuilder answer = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());

        while(n-- > 0){
            st = new StringTokenizer(br.readLine());
            int com = Integer.parseInt(st.nextToken());

            if(com == 1) {
                dq.addFirst(Integer.parseInt(st.nextToken()));
            } else if (com == 2) {
                dq.addLast(Integer.parseInt(st.nextToken()));
            } else if (com == 3) {
                answer.append(dq.isEmpty() ? "-1" : dq.pollFirst()).append("\n");
            } else if (com == 4) {
                answer.append(dq.isEmpty() ? "-1" : dq.pollLast()).append("\n");
            } else if (com == 5) {
                answer.append(dq.size()).append("\n");
            } else if (com == 6) {
                answer.append(dq.isEmpty() ? 1 : 0).append('\n');
            } else if (com == 7) {
                answer.append(dq.isEmpty() ? -1 : dq.peekFirst()).append('\n');
            } else {
                answer.append(dq.isEmpty() ? -1 : dq.peekLast()).append('\n');
            }
        }

        System.out.println(answer);
    }
}