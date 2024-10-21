class Solution {
    boolean solution(String s) {
        int count = 0;
        for(String tmp : s.split("")){
            if(tmp.equals("(")){
                count++;
            } else {
                if(count <= 0){
                    return false;
                } else {
                    count--;
                }
            }
        }
        return count == 0;
    }
}