import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int len = 1;
        while(len < arr.length)
            len*=2;
        for(int i : arr) answer.add(i);
        while(answer.size() < len) answer.add(0);
        return answer.stream().mapToInt(i->i).toArray();
    }
}