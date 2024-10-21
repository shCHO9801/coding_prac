class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] xCount = new int[10];
        int[] yCount = new int[10];
        
        for(String s : X.split("")){
            xCount[Integer.parseInt(s)]++;
        }
        
        for(String s : Y.split("")){
            yCount[Integer.parseInt(s)]++;
        }
        
        for(int i = 9; i >= 0; i--){
            while(xCount[i] > 0 && yCount[i] > 0){
                answer.append(i);
                xCount[i]--;
                yCount[i]--;
            }
        }
        
        if(answer.toString().startsWith("0")) return "0";
        return answer.length() == 0 ? "-1" : answer.toString();
    }
}