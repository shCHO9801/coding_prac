class Solution {
    public static Integer getOneCount(Integer n){
        int result = 0;
        for(char c : Integer.toBinaryString(n).toCharArray()){
            if(c == '1') result++;
        }
        return result;
    }
    
    public int solution(int n) {
        int answer = n;
        int nOneCount = getOneCount(n);
        while(nOneCount != getOneCount(++answer));
        return answer;
    }
}