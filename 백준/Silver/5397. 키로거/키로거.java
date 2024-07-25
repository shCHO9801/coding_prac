import java.util.*;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static String makeString(String s){
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if(tmp == '<') {
                if (!left.isEmpty()) {
                    right.push(left.pop());
                }
            }
            else if(tmp == '>') {
                if (!right.isEmpty()) {
                    left.push(right.pop());
                }
            }
            else if(tmp=='-') {
                if (!left.isEmpty()) {
                    left.pop();
                }
            }
            else {
                left.push(tmp);
            }
        }
        while(!left.isEmpty())
            right.push(left.pop());
        while(!right.isEmpty())
            sb.append(right.pop());
        return sb.toString();
    }
    public static void main(String[] args) {
        int n = in.nextInt();
        List <String> answer = new ArrayList<>();
        while(n-->0){
            String s = in.next();
            answer.add(makeString(s));
        }
        for(String str : answer)
            System.out.println(str);
    }
}