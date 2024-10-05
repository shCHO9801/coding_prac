import java.util.*;
import java.io.*;
class queue{
    int[] arr = new int[2000000];
    int front = 0;
    int back = 0;

    public boolean isEmpty(){
        return back - front == 0;
    }
    public void push(int n){
        this.arr[this.back++] = n;
    }

    public int pop(){
        if(front == back) return -1;
        return arr[front++];
    }

    public int size(){
        return back - front;
    }

    public int empty(){
        return this.isEmpty() ? 1 : 0;
    }

    public int front(){
        return this.isEmpty() ? -1 : this.arr[this.front];
    }

    public int back(){
        return this.isEmpty() ? -1 : this.arr[this.back - 1];
    }
}
class Main{
    static StringTokenizer st;

    public static int getToken(){
        return Integer.parseInt(st.nextToken());
    }

    public static int getToken(String s){
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        queue q = new queue();

        int n = getToken(br.readLine());
        while(n-- > 0){
            st = new StringTokenizer(br.readLine());
            String com = st.nextToken();
            if(com.equals("push")){
                q.push(getToken());
            } else if (com.equals("pop")) {
                answer.append(q.pop()).append('\n');
            } else if (com.equals("size")){
                answer.append(q.size()).append('\n');
            } else if (com.equals("empty")){
                answer.append(q.empty()).append('\n');
            } else if (com.equals("front")){
                answer.append(q.front()).append('\n');
            } else if (com.equals("back")){
                answer.append(q.back()).append('\n');
            }
        }
        System.out.println(answer);
    }
}