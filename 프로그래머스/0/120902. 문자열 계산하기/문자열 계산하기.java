class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] tmp = my_string.split(" ");
        answer = Integer.parseInt(tmp[0]);
        String next = "";
        for(int i = 1; i < tmp.length; i++){
            if(i%2==1){
                next = tmp[i];
            }
            else{
                int x = Integer.parseInt(tmp[i]);
                if(next.equals("+"))
                    answer+=x;
                else
                    answer-=x;
            }
        }
        
        return answer;
    }
}