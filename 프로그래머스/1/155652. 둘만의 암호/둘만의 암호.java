class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        for(char x : s.toCharArray()){
            int plus = 0;
            int val = x;
            while(plus != index){
                val++;
                if(val > (int)'z'){
                    val = val - 'z' + 'a' - 1;
                }
                while(skip.contains(String.valueOf((char)val))){
                    val++;
                    if(val > (int)'z'){
                        val = val - 'z' + 'a' - 1;
                    }
                }
                plus++;
            }
            answer += (char)val;
        }
        return answer;
    }
}