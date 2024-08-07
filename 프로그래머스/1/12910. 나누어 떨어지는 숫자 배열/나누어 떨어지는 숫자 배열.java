import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            if(i%divisor==0)
                list.add(i);
        }
        Collections.sort(list);
        return list.size()==0?new int[]{-1}:list.stream().mapToInt(i->i).toArray();
    }
}