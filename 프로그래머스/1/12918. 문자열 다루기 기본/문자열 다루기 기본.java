class Solution {
    public boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6){
            return false;
        }
        String digit = "0123456789";
        for(String tmp : s.split("")){
            if(!digit.contains(tmp)){
                return false;
            }
        }
        return true;
    }
}