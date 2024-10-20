import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        Stack <Integer> score = new Stack<>();
        StringBuilder tmp = new StringBuilder();
        
        for(char c : dartResult.toCharArray()){
            if(c == '*'){
                int t = score.pop() * 2;
                if(!score.isEmpty()){
                    score.push(score.pop() * 2);
                }
                score.push(t);
            } else if (c == '#'){
                score.push(score.pop() * -1);
            } else if (c == 'S'){
                score.push(Integer.parseInt(tmp.toString()));
                tmp = new StringBuilder();
            } else if (c == 'D'){
                int t = (int)Math.pow(Integer.parseInt(tmp.toString()), 2);
                score.push(t);
                tmp = new StringBuilder();
            } else if (c == 'T'){
                int t = (int)Math.pow(Integer.parseInt(tmp.toString()), 3);
                score.push(t);
                tmp = new StringBuilder();
            } else {
                tmp.append(c - '0');
            }
        }
        
        while(!score.isEmpty()){
            answer += score.pop();
        }
        
        return answer;
    }
}