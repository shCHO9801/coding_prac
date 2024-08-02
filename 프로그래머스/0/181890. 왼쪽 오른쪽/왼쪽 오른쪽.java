import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        List<String> answer = new ArrayList<>();
        List<String> list = new ArrayList<>();
        for(String i : str_list)
            list.add(i);
        int left = -1, right = -1;
        left = list.indexOf("l");
        right = list.indexOf("r");
        System.out.println(left + " " + right);
        String[] ans = {};
        if(left == -1 && right == -1)
            return ans;
        char status = 'x';
        if(left == -1 || right == -1){
            if(left == -1) status = 'r';
            if(right == -1) status = 'l';
        }
        else{
            status = left<right?'l':'r';
        }
        if(status == 'l'){
            for(int i = 0; i < left; i++){
                answer.add(list.get(i));
            }
        }
        else{
            for(int i = right+1;i<list.size();i++)
                answer.add(list.get(i));
        }
        ans = new String[answer.size()];
        int idx = 0;
        for(String i : answer)
            ans[idx++] = i;
        return ans;
    }
}