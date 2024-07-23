class Solution {
    public String solution(String my_string) {
        String answer = "";
        String aeiou = "aeiou";
        for(int i = 0; i < my_string.length();i++){
            char tmp = my_string.charAt(i);
            if(!aeiou.contains(tmp+""))
                answer+=tmp;
        }
        return answer;
    }
}