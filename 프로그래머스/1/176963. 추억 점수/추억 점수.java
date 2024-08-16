class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int idx = 0;
        for(String[] p : photo){
            int score = 0;
            for(String n : p){
                int i = 0;
                for(; i < name.length; i++){
                    if(n.equals(name[i])){
                        break;
                    }
                }
                if(i == name.length)
                    continue;
                else{
                    score += yearning[i];
                }
            }
            answer[idx++] = score;
        }
        return answer;
    }
}