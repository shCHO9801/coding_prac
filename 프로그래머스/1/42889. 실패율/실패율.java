import java.util.*;
class Info implements Comparable<Info> {
    int stage;
    Double score;
    
    public Info(int stage, double score){
        this.stage = stage;
        this.score = score;
    }
    
    @Override
    public int compareTo(Info o){
        int result = o.score.compareTo(this.score);
        if(result == 0){
            return this.stage - o.stage;
        }
        return result;
    }
}

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] clear = new int[N + 2];
        ArrayList<Info> list = new ArrayList<>();
        int totalPeople = stages.length;
        
        for(int stage : stages){
            clear[stage]++;
        }
        
        for(int i = 1; i <= N; i++){
            double score = clear[i] == 0 ? 0 : (double) clear[i] / totalPeople;
            list.add(new Info(i, score));
            totalPeople -= clear[i];
        }
        
        Collections.sort(list);
        
        int idx = 0;
        
        for(Info i : list){
            answer[idx++] = i.stage;
        }
        return answer;
    }
}