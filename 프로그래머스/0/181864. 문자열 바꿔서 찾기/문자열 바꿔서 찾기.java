class Solution {
    public int solution(String myString, String pat) {
        String tmps = "";
        for(int i=0;i<myString.length();i++){
            char tmp = myString.charAt(i);
            if(tmp == 'A') tmps+='B';
            else tmps+='A';
        }
        return tmps.contains(pat)?1:0;
    }
}