import java.util.*;

class Solution {
    
    static boolean check(int n){
        if(n % 5 != 0){
            return false;
        }
        
        while(n != 0){
            int tmp = n % 10;
            if(tmp != 5 && tmp != 0){
                return false;
            }
            n /= 10;
        }
        
        return true;
    }
    
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = l; i <= r; i++){
            if(check(i)){
                list.add(i);
            }
        }
        
        if(list.isEmpty()){
            return new int[]{-1};
        }
        
        return list.stream().mapToInt(x -> x).toArray();
    }
}