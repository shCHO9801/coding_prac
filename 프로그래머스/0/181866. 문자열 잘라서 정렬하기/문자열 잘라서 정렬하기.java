import java.util.*;
class Solution {
    public String[] solution(String myString) {
        List<String> answer = new ArrayList<>();
        String[] tmp = myString.split("x");
        for(String i : tmp)
            if(!i.equals("")) answer.add(i);
        Collections.sort(answer);
        return answer.toArray(new String[answer.size()]);
    }
}