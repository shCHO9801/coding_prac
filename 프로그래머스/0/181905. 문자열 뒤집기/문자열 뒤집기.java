class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(0,s);
        String tmp = my_string.substring(s,e+1);
        String end = my_string.substring(e+1,my_string.length());
        for(int i = tmp.length()-1;i>=0;i--)
            answer+=String.valueOf(tmp.charAt(i));
        answer+=end;
        return answer;
    }
}