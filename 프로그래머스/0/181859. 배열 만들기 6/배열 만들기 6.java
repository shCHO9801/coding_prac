import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int i = 0;
        while(i < arr.length){
            if(stk.isEmpty())
                stk.add(arr[i++]);
            else if(stk.get(stk.size()-1) == arr[i]){
                stk.remove(stk.size()-1);
                i++;
            }
            else if(stk.get(stk.size()-1) != arr[i])
                stk.add(arr[i++]);
        }
        if(stk.isEmpty())
            stk.add(-1);
        return stk.stream().mapToInt(x->x).toArray();
    }
}