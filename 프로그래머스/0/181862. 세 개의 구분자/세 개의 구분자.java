import java.util.*;
class Solution {
    String s = "";
    static char tmp; 
    public String[] solution(String myStr) {
        List<String> answer = new ArrayList<>();
        myStr += "a";
        for(int i = 0; i< myStr.length();i++){
            tmp = myStr.charAt(i);
            if(tmp == 'a'||tmp=='b'||tmp=='c'){
                if(s == "")
                    continue;
                answer.add(s);
                s = "";
            }
            else{
                s += String.valueOf(tmp);
            }
        }
        if(answer.isEmpty()) answer.add("EMPTY");
        return answer.toArray(new String[answer.size()]);
    }
}