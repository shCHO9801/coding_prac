class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        for(int i = myString.length()-1;i>=0;i--){
            String tmp = myString.substring(0,i+1);
            String find = tmp.substring(tmp.length()-pat.length(),tmp.length());
            if(find.equals(pat)){
                answer = tmp;
                break;
            }
        }
        return answer;
    }
}