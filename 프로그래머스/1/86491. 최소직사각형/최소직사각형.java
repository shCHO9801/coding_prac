class Solution {
    public int solution(int[][] sizes) {
        int w = Integer.MIN_VALUE;
        int h = Integer.MIN_VALUE;
        
        for(int[] size : sizes){
            int x = size[0];
            int y = size[1];
            
            if(x > y){
                int tmp = x;
                x = y;
                y = tmp;
            }
            
            w = Math.max(w, x);
            h = Math.max(h, y);
        }
        
        return w * h;
    }
}