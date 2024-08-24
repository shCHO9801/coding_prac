import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int select = nums.length / 2;
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int n : nums){
            set.add(n);
        }
        
        return set.size() > select ? select : set.size();
    }
}