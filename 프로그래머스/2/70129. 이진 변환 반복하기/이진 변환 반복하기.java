class Solution {
    static String makeBinary(int num){
        String answer = "";
        String tmp = "";
        while(num != 1){
            tmp += String.valueOf(num%2);
            num/=2;
        }
        tmp+='1';
        for(int i = tmp.length()-1; i >= 0; i--){
            answer+=tmp.charAt(i);
        }
        
        return answer;
    }
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while(!s.equals("1")){
            int x = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '1') x++;
            }
            answer[0]++;
            answer[1] += s.length()-x;
            s = makeBinary(x);
        }
        
        
        return answer;
    }
}