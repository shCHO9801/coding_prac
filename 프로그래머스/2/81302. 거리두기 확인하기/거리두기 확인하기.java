class Solution {
    public int[] solution(String[][] places) {
        int len = places.length;
        int[] answer = new int[len];
        
        for(int i = 0; i < len; i++) {
            answer[i] = function(places[i]) ? 1 : 0;
        }
        
        return answer;
    }
    
    private boolean function(String[] place) {
        
        for(int i = 0; i < place.length; i++) {
            for(int j = 0; j < place[i].length(); j++) {
                if(place[i].charAt(j) != 'P') continue;
                
                // 오른쪽
                if(j + 1 < place[i].length() && place[i].charAt(j + 1) == 'P') return false;
                if(j + 2 < place[i].length() && place[i].charAt(j + 2) == 'P') {
                    if(place[i].charAt(j + 1) != 'X') return false;
                }
                
                // 아래
                if(i + 1 < place.length && place[i + 1].charAt(j) == 'P') return false;
                if(i + 2 < place.length && place[i + 2].charAt(j) == 'P') {
                    if(place[i + 1].charAt(j) != 'X') return false;
                }
                
                // 대각 오
                if(i + 1 < place.length && j + 1 < place[i + 1].length() && place[i + 1].charAt(j + 1) == 'P') {
                    if(place[i + 1].charAt(j) != 'X' || place[i].charAt(j + 1) != 'X') return false;
                }
                
                if(i + 1 < place.length && 0 <= j - 1 && place[i + 1].charAt(j - 1) == 'P') {
                    if(place[i + 1].charAt(j) != 'X' || place[i].charAt(j - 1) != 'X') return false;
                }
            }
        }
        
        return true;
    }
}