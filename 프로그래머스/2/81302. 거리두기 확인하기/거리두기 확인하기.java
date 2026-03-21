import java.util.*;

class Solution {
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        
        
        for(int i = 0; i < places.length; i++) {
            answer[i] = func(places[i]) ? 1 : 0;
        }
        
        return answer;
    }
    
    private boolean func(String[] place) {
        
        for(int x = 0; x < 5; x++) {
            for(int y = 0; y < 5; y++) {
                if(place[x].charAt(y) != 'P') continue;
                
                if(y + 1 < 5) {
                    if(place[x].charAt(y + 1) == 'P') return false;
                    if(y + 2 < 5 && place[x].charAt(y + 2) == 'P' && place[x].charAt(y + 1) != 'X')
                        return false;
                }
                
                if(x + 1 < 5) {
                    if(place[x + 1].charAt(y) == 'P') return false;
                    if(x + 2 < 5 && place[x + 2].charAt(y) == 'P' && place[x + 1].charAt(y) != 'X')
                        return false;
                }
                
                if(x + 1 < 5 && y + 1 < 5 && place[x + 1].charAt(y + 1) == 'P') {
                    if(place[x + 1].charAt(y) != 'X') return false;
                    if(place[x].charAt(y + 1) != 'X') return false;
                }
                
                if(x + 1 < 5 && 0 <= y - 1 && place[x + 1].charAt(y - 1) == 'P') {
                    if(place[x + 1].charAt(y) != 'X') return false;
                    if(place[x].charAt(y - 1) != 'X') return false;
                }
                
            }
        }
        return true;
    }
}