class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        int idx = 0;
        for(int i = 0; i<s.length();i++){
            char tmp = s.charAt(i);
            if(tmp == ' '){
                answer+=String.valueOf(tmp);
                idx = 0;
                continue;
            }
            else if(idx % 2 == 0){
                answer += String.valueOf((char)(tmp - 'a' + 'A'));
            }
            else{
                answer += String.valueOf(tmp);
            }
            idx++;
        }
        return answer;
    }
}