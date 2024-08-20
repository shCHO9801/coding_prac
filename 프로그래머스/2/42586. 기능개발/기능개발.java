import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        ArrayList <Integer> tmp = new ArrayList<>();
        int idx = 0;
        
        while(idx < progresses.length){
            int count = 0;
            
            for(int i = idx; i < progresses.length; i++){
                progresses[i] += speeds[i];
                if(progresses[i] > 100){
                    progresses[i] = 100;
                }
            }
            
            
            
            if(progresses[idx] >= 100){
                
                for(int i = idx; i < progresses.length; i++){
                    System.out.print(progresses[i] + " ");
                }
                System.out.println();
                
                for(int i = idx; i < progresses.length; i++){
                    if(progresses[i] < 100){
                        break;
                    }
                    idx++;
                    count++;
                    if(idx >= progresses.length){
                        break;
                    }
                }
                tmp.add(count);
            }
        }
        
        return tmp.stream().mapToInt(i -> i).toArray();
    }
}