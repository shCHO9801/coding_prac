import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        Map <String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        
        for(char c : s.toCharArray()){
            if (Character.isDigit(c)){
                answer = answer * 10 + Integer.parseInt(String.valueOf(c));
            } else {
                sb.append(c);    
            }
            
            if(sb.length() != 0 && map.containsKey(sb.toString())){
                answer = answer * 10 + map.get(sb.toString());
                sb = new StringBuilder();
            }
            
        }
        return answer;
    }
}