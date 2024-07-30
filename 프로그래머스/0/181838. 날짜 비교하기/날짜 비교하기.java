class Solution {
    static String a,b;
    public int solution(int[] date1, int[] date2) {
        a=""; b="";
        for(int i:date1) a+=String.valueOf(i);
        for(int i:date2) b+=String.valueOf(i);
        return Integer.parseInt(a)<Integer.parseInt(b)?1:0;
    }
}