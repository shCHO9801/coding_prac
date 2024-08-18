class Solution {
    public int solution(String s) {
        int answer = 0;
        int idx = 0;
        int x, y;
        char cur = 'c';
        char find = 'c';
        
        while(idx < s.length()){
            find = s.charAt(idx++);
            x = 1;
            y = 0;
            while(idx < s.length() && x != y){
                cur = s.charAt(idx++);
                if(cur == find){
                    x++;
                }
                else{
                    y++;
                }
            }
            
            s = s.substring(idx,s.length());
            idx = 0;
            answer++;
        }
        if(s.length() > 0){
            answer++;
        }
        return answer;
    }
}