import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set <Integer> set = new HashSet<>();
        int get = nums.length / 2;
        
        for(int n : nums) {
            set.add(n);
        }
        
        return set.size() >= get ? get : set.size();   
    }
}