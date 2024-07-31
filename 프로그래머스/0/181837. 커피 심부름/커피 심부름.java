class Solution {
    public int solution(String[] order) {
        int answer = 0;
        String ame = "americano";
        String any = "anything";
        for(String i : order){
            if(i.contains(ame) || i.equals(any))
                answer+=4500;
            else
                answer+=5000;
        }
        return answer;
    }
}