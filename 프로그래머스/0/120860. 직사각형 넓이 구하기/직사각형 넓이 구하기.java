class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int minx = 260, miny = 260;
        int maxx = -260, maxy = -260;
        for(int i[] : dots){
            int x = i[0];
            int y = i[1];
            minx = Math.min(x,minx);
            miny = Math.min(y,miny);
            maxx = Math.max(x,maxx);
            maxy = Math.max(y,maxy);
        }
        return (maxx-minx) * (maxy-miny);
    }
}