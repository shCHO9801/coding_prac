import java.util.*;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static Stack<Character> makeStack(String s){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            st.add(s.charAt(i));
        }
        return st;
    }
    public static String make_answer(Stack<Character>l, Stack <Character>r){
        while(!l.isEmpty()){
            r.push(l.pop());
        }
        StringBuilder sb = new StringBuilder();
        while(!r.isEmpty())
            sb.append(r.pop());
        return sb.toString();
    }
    public static void main(String[] args) {
        Stack<Character> left;
        Stack<Character> right = new Stack<>();
        String s = in.next();
        left = makeStack(s);

        int n = in.nextInt();
        while(n-->0){
            String tmp = in.next();
            if(tmp.equals("P")){
                String input = in.next();
                left.add(input.charAt(0));
            }
            else if(tmp.equals("L")){
                if(!left.isEmpty())
                    right.push(left.pop());
            }
            else if(tmp.equals("D")){
                if(!right.isEmpty())
                    left.push(right.pop());
            }
            else if(tmp.equals("B"))
                if(!left.isEmpty())
                    left.pop();
        }
        System.out.println(make_answer(left,right));
    }
}