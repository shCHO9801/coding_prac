import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        List <Integer>tmp = new ArrayList<>();
        Arrays.fill(answer, -1);
        for(int i : arr){
            if(tmp.indexOf(i)==-1)
                tmp.add(i);
        }
        int len = k <= tmp.size()?k:tmp.size();
        for(int i = 0; i<len;i++)
            answer[i] = tmp.get(i);
        return answer;
    }
}