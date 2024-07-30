class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i = 0;i<myString.length();i++){
            char tmp = myString.charAt(i);
            if(tmp < 'l')
                answer+=String.valueOf('l');
            else
                answer+=String.valueOf(tmp);
        }
        return answer;
    }
}