class Solution {
    public String solution(int a, int b) {
        int[] months = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String[] days = { "THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED" };
        
        for(int i = 1; i < a; i++){
            b += months[i];
        }
        
        return days[b % 7];
    }
}