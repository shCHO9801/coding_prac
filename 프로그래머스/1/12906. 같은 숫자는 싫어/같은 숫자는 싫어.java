import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            if(list.size()==0){
                list.add(i);
                continue;
            }
            if(list.get(list.size()-1) != i)
                list.add(i);
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}