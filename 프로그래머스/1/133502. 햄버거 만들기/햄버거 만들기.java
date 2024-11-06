import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int i : ingredient) {
            list.add(i);
        }
        
        int i = 0;
        while(i < list.size() - 3) {
            if(list.get(i) == 1
              && list.get(i + 1) == 2
              && list.get(i + 2) == 3
              && list.get(i + 3) == 1) {
                list.remove(i + 3);
                list.remove(i + 2);
                list.remove(i + 1);
                list.remove(i);
                answer++;
                i -= 4;
            }
            if(i < 0) i = 0;
            else i++;
        }
        return answer;
    }
}