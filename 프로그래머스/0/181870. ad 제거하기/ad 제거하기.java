import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        List<String> answer = new ArrayList<>();
        for(String i : strArr)
            if(!i.contains("ad"))
               answer.add(i);
        return answer.toArray(new String[answer.size()]);
    }
}