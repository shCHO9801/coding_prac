class Solution {
    int answer = 0;
    boolean found = false;
    int count = 0;
    String words = "AEIOU";
    
    public int solution(String word) {
        dfs("", word);
        return answer;
    }
    
    private void dfs(String s, String word) {
        if(found) return;
        if(s.length() > 5) return;
        
        if(!s.isEmpty()) {
            count++;
            if(s.equals(word)) {
                found = true;
                answer = count;
                return;
            }
        }
        
        for(String w : words.split("")) {
            dfs(s + w, word);
        }
    }
}