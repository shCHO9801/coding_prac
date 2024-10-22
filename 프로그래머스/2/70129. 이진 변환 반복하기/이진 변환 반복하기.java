class Solution {
    public int[] solution(String s) {
        int conversion = 0;
        int deleteZero = 0;
        
        while(!s.equals("1")){
            int len = s.length();
            conversion++;
            for(char c : s.toCharArray()){
                if(c == '0'){
                    deleteZero++;
                    len--;
                }
            }
            s = Integer.toBinaryString(len);
        }
        
        
        return new int[]{conversion, deleteZero};
    }
}