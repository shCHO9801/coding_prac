class Solution {
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    
    public static int makeBin(int n){
        StringBuilder sb = new StringBuilder();
        int result = 0;
        
        while(n != 0){
            sb.append(String.valueOf(n%3));
            n /= 3;
        }
        
        int mul = 1;
        String tmp = reverse(sb.toString());
        for(char c : tmp.toCharArray()){
            result += (c - '0') * mul;
            mul *= 3;
        }
        return result;
    }
    
    public int solution(int n) {
        return makeBin(n);
    }
}