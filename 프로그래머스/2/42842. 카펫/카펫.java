class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int total = yellow + brown;
        
        for(int h = 3; h <= total / 3; h++){
            if(total % h == 0){
                int w = total / h;
                
                int y = (w - 2) * (h - 2);
                if(y == yellow){
                    return answer = new int[] {w, h};
                }
            }
        }
        return new int[0];
    }
}