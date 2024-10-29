import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        String s = br.readLine();

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)) {
                stack.push((int) c - '0');
            } else {
                int n1 = stack.pop();
                int n2 = stack.pop();
                switch (c){
                    case '+' :
                        stack.push(n1 + n2);
                        break;
                    case '-' :
                        stack.push(n2 - n1);
                        break;
                    case '*' :
                        stack.push(n1 * n2);
                        break;
                    case '/' :
                        stack.push(n2 / n1);
                        break;
                }
            }
        }
        
        System.out.println(stack.pop());
        br.close();
    }
}