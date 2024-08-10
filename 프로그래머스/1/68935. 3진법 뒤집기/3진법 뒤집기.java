class Solution {
    public int solution(int n) {
        int answer = 0;
        int mul = 1;
        
        String binary3 = "";
        while(n != 0){
            binary3 += String.valueOf(n%3);
            n/=3;
        }
        
        for(int i = binary3.length()-1; i >= 0; i--){
            answer += mul * Integer.parseInt(String.valueOf(binary3.charAt(i)));
            mul *= 3;
        }
        
        return answer;
    }
}