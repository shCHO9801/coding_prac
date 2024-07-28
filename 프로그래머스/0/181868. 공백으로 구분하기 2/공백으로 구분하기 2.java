import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer;
        StringTokenizer st = new StringTokenizer(my_string," ");
        int n = st.countTokens();
        answer = new String[n];
        for(int i = 0; i < n; i++){
            answer[i] = st.nextToken();
        }
        return answer;
    }
}