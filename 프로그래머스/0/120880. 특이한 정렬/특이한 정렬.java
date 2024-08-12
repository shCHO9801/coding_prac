import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : numlist)
            list.add(i);
        Collections.sort(list, (x,y) -> {
            int diff1 = Math.abs(x-n);
            int diff2 = Math.abs(y-n);
            if(diff1 == diff2)
                return y-x;
            else{
                return diff1 - diff2;
            }
        });
        
        return list.stream().mapToInt(i->i).toArray();
    }
}