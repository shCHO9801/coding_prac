class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String numbers = "0123456789";
        for(int i=0;i<my_string.length();i++){
            char tmp = my_string.charAt(i);
            if(numbers.contains(tmp+""))
                answer+=Integer.parseInt(tmp+"");
        }
        return answer;
    }
}