class Solution {
    boolean solution(String s) {
        int p = 0; int y = 0;
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            char tmp = s.charAt(i);
            if(tmp == 'p') p++;
            else if(tmp == 'y') y++;
        }
        
        if(p==0&&y==0) return true;
        if(p==y) return true;
        return false;
    }
}