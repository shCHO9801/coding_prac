import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        List <String> list = new ArrayList<>();
        
        for(int i : numbers){
            list.add(String.valueOf(i));
        }
        
        Collections.sort(list, (x, y) -> (y + x).compareTo(x + y));
        
        if(list.get(0).equals("0")) return "0";
        
        for(String s : list){
            answer.append(s);
        }
        
        return answer.toString();
    }
}