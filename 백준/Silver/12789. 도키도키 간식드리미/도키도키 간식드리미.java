import java.util.*;
import java.io.*;

public class Main{
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        Stack <Integer> w = new Stack<>();
        Queue <Integer> q = new LinkedList<>();

        int cur = 1;
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            q.add(Integer.parseInt(st.nextToken()));
        }

        while(!q.isEmpty()){
            if(cur == q.peek()){
                q.poll();
                cur++;
            } else if (!w.isEmpty() && w.peek() == cur){
                w.pop();
                cur++;
            } else {
                w.push(q.poll());
            }
        }

        while(!w.isEmpty()){
            if(w.peek() == cur){
                cur++;
                w.pop();
            } else {
                System.out.println("Sad");
                return;
            }
        }

        System.out.println("Nice");
    }
}