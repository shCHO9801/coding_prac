class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i = 0; i<my_string.length();i++){
            char tmp = my_string.charAt(i);
            if(Character.isUpperCase(tmp))
                answer[tmp-'A']++;
            else
                answer[tmp-'a'+26]++;
        }
        return answer;
    }
}