import java.util.*;
import java.io.*;
import java.nio.*;

class Main{
    static StringTokenizer st;

    public static int getToken(){
        return Integer.parseInt(st.nextToken());
    }
    public static int getToken(String s){
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        Stack <Integer> stack = new Stack<>();
        int n = getToken(br.readLine());

        while(n-- > 0){
            st = new StringTokenizer(br.readLine());
            int x = getToken();

            if(x == 1){
                stack.push(getToken());
            } else if (x == 2){
                answer.append(stack.isEmpty() ? -1 : stack.pop()).append('\n');
            } else if (x == 3){
                answer.append(stack.size()).append('\n');
            } else if (x == 4){
                answer.append(stack.isEmpty() ? 1 : 0).append('\n');
            } else {
                answer.append(stack.isEmpty() ? -1 : stack.peek()).append('\n');
            }
        }

        System.out.println(answer);
    }
}