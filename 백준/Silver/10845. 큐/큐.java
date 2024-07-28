import java.nio.*;
import java.io.*;
import java.util.*;
public class Main{
    static StringTokenizer st;
    static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();
        n = Integer.parseInt(br.readLine());
        int last = 0;
        while(n-->0){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.equals("push")){
                int x = Integer.parseInt(st.nextToken());
                q.add(x);
                last = x;
            }
            else if(command.equals("pop")){
                if(q.isEmpty()){
                    answer.add(-1);
                }
                else{
                    answer.add(q.remove());
                }
            }
            else if(command.equals("size")){
                answer.add(q.size());
            }
            else if(command.equals("empty"))
                answer.add(q.isEmpty()?1:0);
            else if(command.equals("front")){
                if(q.isEmpty())
                    answer.add(-1);
                else
                    answer.add(q.element());
            }
            else if(command.equals("back")){
                if(q.isEmpty())
                    answer.add(-1);
                else
                    answer.add(last);
            }
        }
        for(int i : answer)
            System.out.println(i);
    }
}