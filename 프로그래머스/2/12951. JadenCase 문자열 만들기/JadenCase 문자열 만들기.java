class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        int space = 0;
        for(int i = 0; i < s.length(); i++){
            char tmp = s.charAt(i);
            if(tmp == ' '){
                answer+=' ';
                space = 0;
                continue;
            }
            if(space == 0){
                if(Character.isLowerCase(tmp)){
                    tmp = (char)(tmp - 'a' + 'A');
                }
            }
            answer += tmp;
            space++;
        }
        return answer;
    }
}