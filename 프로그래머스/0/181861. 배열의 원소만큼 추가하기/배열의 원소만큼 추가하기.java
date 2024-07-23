import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List <Integer> list = new ArrayList<>();
        for(int x : arr){
            int k = x;
            while(k-->0)
                list.add(x);
        }
        return list.stream().mapToInt(x->x).toArray();
    }
}