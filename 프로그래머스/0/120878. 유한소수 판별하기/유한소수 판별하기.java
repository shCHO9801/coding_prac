import java.util.*;
class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        int idx = 2;
        while(Math.max(a,b) >= idx){
            while(a % idx == 0 && b % idx == 0){
                a/=idx;
                b/=idx;
            }
            idx++;
        }
        if(b <= 2 || b == 5)  return 1;
        
        idx = 2;
        HashSet<Integer> set = new HashSet<>();
        while(b >= idx){
            while(b % idx == 0){
                set.add(idx);
                b/=idx;
            }
            idx++;
        }
        ArrayList<Integer> list = new ArrayList(set);
        
        if(list.size() == 2 && list.get(0) == 2 && list.get(1) == 5)
            answer = 1;
        else if(list.size() == 1){
            if(list.get(0) == 2 || list.get(0) == 5)
                answer = 1;
        }
        return answer;
    }
}