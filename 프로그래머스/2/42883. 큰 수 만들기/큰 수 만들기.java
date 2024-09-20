import java.util.*;

class Solution {
    
    public String solution(String number, int k) {
        Stack <Character> st = new Stack<>();
        
        for(char c : number.toCharArray()){
            while(!st.isEmpty() && k > 0 && st.peek() < c){
                st.pop();
                k--;
            }
            st.push(c);
        }
        
        while(k-- > 0){
            st.pop();
        }
        
        StringBuilder answer = new StringBuilder();
        for(char c : st){
            answer.append(c);
        }
        return answer.toString();
    }
}