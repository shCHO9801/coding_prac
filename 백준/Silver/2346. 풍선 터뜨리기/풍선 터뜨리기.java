import java.util.*;
import java.io.*;

class Node{
    public Integer idx;
    public Integer com;

    public Node(Integer idx, Integer com) {
        this.idx = idx;
        this.com = com;
    }
}

public class Main{
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Node> dq = new ArrayDeque<>();
        StringBuilder answer = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            dq.add(new Node(i + 1, Integer.parseInt(st.nextToken())));
        }

        while(!dq.isEmpty()){
            Node cur = dq.pollFirst();
            Integer com = cur.com;
            Integer idx = cur.idx;

            answer.append(idx).append(" ");
            if(dq.isEmpty()) break;
            if(com < 0) {
                while(com++ < 0) {
                    dq.addFirst(dq.pollLast());
                }
            } else {
                while(--com > 0){
                    dq.addLast(dq.pollFirst());
                }
            }
        }

        System.out.println(answer);
    }
}