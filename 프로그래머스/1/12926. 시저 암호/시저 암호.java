class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length();i++){
            char tmp = s.charAt(i);
            int c = tmp + n;
            if(Character.isLowerCase(tmp)){
                if(c > 'z')
                    c-=26;
            }
            else if(Character.isUpperCase(tmp)){
                if(c > 'Z')
                    c-=26;
            }
            else
                c = ' ';
            answer+=String.valueOf((char)c);
        }
        return answer;
    }
}