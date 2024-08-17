import java.util.*;
class Solution {
    static int[] p1 = {1,2,3,4,5};
    static int[] p2 = {2,1,2,3,2,4,2,5};
    static int[] p3 = {3,3,1,1,2,2,4,4,5,5};
    static int findScore(int[] answers, int[] p){
        int result = 0;
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == p[i%p.length]){
                result++;
            }
        }
        return result;
    }
    public int[] solution(int[] answers) {
        ArrayList <Integer> answer = new ArrayList<>();
        int[] checkAnswer = new int[4];
        int maxScore = -1;
        int countMaxPeople = 0;
        
        checkAnswer[1] = findScore(answers, p1);
        checkAnswer[2] = findScore(answers, p2);
        checkAnswer[3] = findScore(answers, p3);
        
        for(int i = 1; i < checkAnswer.length; i++){
            maxScore = Math.max(checkAnswer[i], maxScore);
        }
        
        for(int i = 1; i < checkAnswer.length; i++){
            if(maxScore == checkAnswer[i]){
                answer.add(i);
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}