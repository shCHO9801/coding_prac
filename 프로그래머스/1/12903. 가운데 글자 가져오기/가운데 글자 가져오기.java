class Solution {
    public String solution(String s) {
        String answer = "";
        int middle = s.length()/2;
        if(s.length()%2==1)
            answer = s.substring(middle,middle+1);
        else
            answer = s.substring(middle-1,middle+1);
        return answer;
    }
}