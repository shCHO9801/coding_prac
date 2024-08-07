class Solution {
    public boolean solution(int x) {
        int tmp = 0;
        String s = String.valueOf(x);
        for(int i = 0; i < s.length();i++){
            char w = s.charAt(i);
            tmp+=Integer.parseInt(String.valueOf(w));
        }
        if(x%tmp==0) return true;
        return false;
    }
}