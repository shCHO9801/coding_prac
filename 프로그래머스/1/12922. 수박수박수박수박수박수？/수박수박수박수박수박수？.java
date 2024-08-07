class Solution {
    public String solution(int n) {
        String answer = "";
        for(int i = 0; i<n/2+1;i++)
            answer+="수박";
        return answer.substring(0,n);
    }
}