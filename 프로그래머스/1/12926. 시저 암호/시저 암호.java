class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        for(char c : s.toCharArray()){
            int tmp = c + n;
            if(c == ' '){
                tmp = ' ';
            } else if (Character.isLowerCase(c) && tmp > 'z'){
                tmp -= 26;
            } else if (Character.isUpperCase(c) && tmp > 'Z'){
                tmp -= 26;
            }
            answer.append((char)tmp);
        }
        return answer.toString();
    }
}