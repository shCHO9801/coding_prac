class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] token = binomial.split(" ");
        int a = Integer.parseInt(token[0]);
        int b = Integer.parseInt(token[2]);
        switch(token[1]){
            case "+":
                answer = a+b;
                break;
            case "-":
                answer = a-b;
                break;
            case "*":
                answer = a*b;
                break;
        }
        return answer;
    }
}