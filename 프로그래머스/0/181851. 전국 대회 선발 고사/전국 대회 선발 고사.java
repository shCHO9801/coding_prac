import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List <Integer> list = new ArrayList<>();
        int[] findIdx = new int[3];
        for(int i = 0; i < rank.length;i++){
            if(attendance[i])
                list.add(rank[i]);
        }
        Collections.sort(list);
        for(int i = 0; i < 3; i++){
            if(i<list.size()){
                int x = list.get(i);
                for(int j = 0; j < rank.length; j++){
                    if(x==rank[j])
                        findIdx[i] = j;
                }
            }
        }
        int mul = 10000;
        for(int i = 0; i<3 ;i++){
            answer += mul*findIdx[i];
            mul/=100;
        }
        return answer;
    }
}