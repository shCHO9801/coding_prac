class Solution {
    public static int func(String tmp, String p){
        return Long.parseLong(tmp) <= Long.parseLong(p) ? 1 : 0;
    }
    
    public int solution(String t, String p) {
        if(t.length() == 1 || (t.length() == p.length())){
            return func(t, p);
        }
        int answer = 0;
        int len = p.length();
        
        for(int i = 0; i <= t.length() - len; i++){
            String tmp = t.substring(i,i + len);
            System.out.println(tmp);
            answer += func(tmp, p);
        }
        
        return answer;
    }
}