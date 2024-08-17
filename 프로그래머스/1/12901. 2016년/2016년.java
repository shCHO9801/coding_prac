class Solution {
    static int[] months = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    static String[] days = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
    public String solution(int a, int b) {
        for(int i = 1; i < a; i++){
            b += months[i];
        }
        b = (b + 4) % 7;
        return days[b];
    }
}