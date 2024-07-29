import java.util.*;
import java.io.*;
import java.nio.*;
public class Main{
    static StringTokenizer st;
    static int n;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static List<Integer> answer;
    static Deque<Integer> dq;
    static void getAnswer(int n)throws IOException{
        while(n-->0){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("push_back")){
                int x = Integer.parseInt(st.nextToken());
                dq.addLast(x);
            }
            if(s.equals("push_front")){
                int x = Integer.parseInt(st.nextToken());
                dq.addFirst(x);
            }
            if(s.equals("pop_front")){
                if(dq.isEmpty())
                    answer.add(-1);
                else
                    answer.add(dq.removeFirst());
            }
            if(s.equals("pop_back")){
                if(dq.isEmpty())
                    answer.add(-1);
                else answer.add(dq.removeLast());
            }
            if(s.equals("size"))
                answer.add(dq.size());
            if(s.equals("empty"))
                answer.add(dq.isEmpty()?1:0);
            if(s.equals("front")){
                if(dq.isEmpty())
                    answer.add(-1);
                else
                    answer.add(dq.getFirst());
            }
            if(s.equals("back")){
                if(dq.isEmpty())
                    answer.add(-1);
                else
                    answer.add(dq.getLast());
            }

        }

    }
    public static void main(String[] args) throws IOException{
        answer = new ArrayList<>();
        dq = new ArrayDeque<>();
        n = Integer.parseInt(br.readLine());
        getAnswer(n);
        StringBuilder sb = new StringBuilder();
        for(int i: answer)
            sb.append(i + "\n");
        System.out.println(sb);
    }
}