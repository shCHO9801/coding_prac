class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for(int i = 0;i < my_string.length();i++){
            char tmp = my_string.charAt(i);
            if(tmp == alp.charAt(0))
                answer += String.valueOf(Character.toUpperCase(tmp));
            else
                answer += String.valueOf(tmp);
        }
        return answer;
    }
}