class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {51, 51, -1, -1};
        
        for(int i = 0; i < wallpaper.length; i++) {
            for(int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    int startX = i;
                    int startY = j;
                    int endX = i + 1;
                    int endY = j + 1;
                    
                    answer[0] = Math.min(answer[0], startX);
                    answer[1] = Math.min(answer[1], startY);
                    answer[2] = Math.max(answer[2], endX);
                    answer[3] = Math.max(answer[3], endY);
                }
            }
        }
        return answer;
    }
}