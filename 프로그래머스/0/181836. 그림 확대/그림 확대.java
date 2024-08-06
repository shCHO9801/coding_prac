import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> list = new ArrayList<>();
        String[] answer;
        for(String i : picture){
            String tmp = "";
            for(int j = 0;j<i.length();j++){
                char x = i.charAt(j);
                for(int l=0;l<k;l++)
                    tmp+=String.valueOf(x);
            }
            for(int l = 0; l < k;l++)
                list.add(tmp);
        }
        answer = new String[list.size()];
        for(int i = 0; i< list.size();i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}