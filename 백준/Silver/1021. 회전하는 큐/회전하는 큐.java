import java.util.*;
import java.io.*;
import java.nio.*;
public class Main{
    static int N, M;
    static StringTokenizer st;
    static Deque<Integer> dq = new ArrayDeque<>();
    static int answer;

    static int findNum(int n){
        int result = 0;
        int idx = 0;

        if(dq.peek() == n){
            dq.pollFirst();
            return result;
        }
        while(dq.peek() != n){
            idx++;
            dq.addLast(dq.pollFirst());
        }

        result = Math.min(idx, dq.size() - idx);
        dq.pollFirst();
        return result;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= N; i++){
            dq.addLast(i);
        }

        st = new StringTokenizer(br.readLine());
        while(M-- > 0){
            int find = Integer.parseInt(st.nextToken());
            answer += findNum(find);
        }

        System.out.println(answer);

    }
}