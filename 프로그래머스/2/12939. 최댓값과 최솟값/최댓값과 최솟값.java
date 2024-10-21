class Solution {
    public String solution(String s) {
        String answer = "";
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(String tmp : s.split(" ")){
            int t = Integer.parseInt(tmp);
            min = Math.min(min, t);
            max = Math.max(max, t);
        }
        
        return min + " " + max;
    }
}