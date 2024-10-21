class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        
        for(char c : s.toCharArray()){
            if(c == ' '){
                if(tmp.length() > 0){
                    answer.append(tmp);
                    tmp = new StringBuilder();
                }
                answer.append(' ');
            } else {
                if(Character.isDigit(c)){
                    tmp.append(c);
                } else if(tmp.length() == 0){
                    tmp.append(Character.toUpperCase(c));
                } else {
                    tmp.append(Character.toLowerCase(c));
                }
            }
        }
        
        if(tmp.length() > 0){
            answer.append(tmp);
        }
        
        return answer.toString();
    }
}