import java.util.*;

class Solution{
    public int solution(String s){
        Stack<Character> stack = new Stack<>();
        char[] cArr = s.toCharArray();
        
        for(int i = 0; i < cArr.length; i++){
            char c = cArr[i];
            
            if(stack.isEmpty()){
                stack.push(c);
            } else {
                if(stack.peek() == c){
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}