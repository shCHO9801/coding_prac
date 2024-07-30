import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        for(String i : intStrs){
            String tmp = i.substring(s,s+l);
            if(Integer.parseInt(tmp) > k)
                answer.add(Integer.parseInt(tmp));
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}