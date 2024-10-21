class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        
        for(char c : s.toCharArray()){
            for(int i = 0; i < index; i++){
                do{
                    c++;
                    if(c > 'z') c = 'a';
                } while(skip.contains(String.valueOf(c)));
            }
            answer.append(c);
        }
        
        return answer.toString();
    }
}