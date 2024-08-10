class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] tmp = s.split(" ");
        int max = Integer.parseInt(tmp[0]);
        int min = Integer.parseInt(tmp[0]);
        for(String t : tmp){
            max = Math.max(max, Integer.parseInt(t));
            min = Math.min(min, Integer.parseInt(t));
        }
        answer.append(min + " " + max);
        return answer.toString();
    }
}