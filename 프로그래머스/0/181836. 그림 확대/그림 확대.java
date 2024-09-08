class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        int idx = 0;
        
        for(String p : picture){
            char[] tmp = p.toCharArray();
            StringBuilder sb = new StringBuilder();
            
            for(char c : tmp){
                for(int i = 0; i < k; i++){
                    sb.append(c);
                }
            }
            
            for(int i = 0; i < k; i++){
                answer[idx++] = sb.toString();
            }
        }
        
        return answer;
    }
}