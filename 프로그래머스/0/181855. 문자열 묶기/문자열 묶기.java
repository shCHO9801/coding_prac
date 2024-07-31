import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] count = new int[100001];
        for(String i : strArr)
            count[i.length()]++;
        for(int i : count)
            answer = Math.max(answer, i);
        return answer;
    }
}