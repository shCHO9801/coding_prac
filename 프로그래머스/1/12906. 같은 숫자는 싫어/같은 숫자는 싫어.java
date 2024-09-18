import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> st = new Stack<>();
        
        st.add(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if(st.peek() == arr[i]){
                continue;
            }
            st.add(arr[i]);
        }
        
        int[] answer = new int[st.size()];
        int idx = 0;
        
        for(int i : st){
            answer[idx++] = i;
        }
        

        return answer;
    }
}