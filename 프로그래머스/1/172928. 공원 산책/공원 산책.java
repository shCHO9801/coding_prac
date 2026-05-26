class Solution {
    static int curX = 0;
    static int curY = 0;
    public int[] solution(String[] park, String[] routes) {
        
        findStart(park);
        
        int maxX = park[0].length();
        int maxY = park.length;
        
        System.out.println("start : " + curY + " " + curX);
        
        for(String rout : routes) {
            String[] split = rout.split(" ");
            String dir = split[0];
            int repeat = Integer.parseInt(split[1]);
            
            if(dir.equals("E")) {
                if(curX + repeat >= maxX) continue;
                if(findXWhenMoveEastWest(curX + 1, curX + repeat, park)) continue;
                
                curX += repeat;
            } else if(dir.equals("W")) {
                if(curX - repeat < 0) continue;
                if(findXWhenMoveEastWest(curX - repeat, curX - 1, park)) continue;
                
                curX -= repeat;
            } else if (dir.equals("S")) {
                if(curY + repeat >= maxY) continue;
                if(findXWhenMoveNorthSouth(curY + 1, curY + repeat, park)) continue;
                
                curY += repeat;
            } else {
                if(curY - repeat < 0) continue;
                if(findXWhenMoveNorthSouth(curY - repeat, curY - 1, park)) continue;
                
                curY -= repeat;
            }
            
        }
        
        return new int[]{curY, curX};
    }
    
    private static void findStart(String[] park) {
        for(int i = 0; i < park.length; i++) {
            for(int j = 0; j < park[i].length(); j++) {
                if(park[i].charAt(j) == 'S') {
                    curY = i;
                    curX = j;
                    return;
                }
            }
        }
    }    
    
    private static boolean findXWhenMoveEastWest(int sX, int eX, String[] park) {
        
        for(int x = sX; x <= eX; x++) {
            if(park[curY].charAt(x) == 'X') return true;
        }
        
        return false;
    }
    
    private static boolean findXWhenMoveNorthSouth(int sY, int eY, String[] park) {
        
        for(int y = sY; y <= eY; y++) {
            if(park[y].charAt(curX) == 'X') return true;
        }
        
        return false;
    }
}