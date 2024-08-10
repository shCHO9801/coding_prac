class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int left = 0;
        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            if(x == ')'){
                if(left==0){
                    answer = false;
                    break;
                }
                else{
                    left--;
                }
            }
            else{
                left++;
            }
        }
        if(left!=0) answer = false;
        return answer;
    }
}