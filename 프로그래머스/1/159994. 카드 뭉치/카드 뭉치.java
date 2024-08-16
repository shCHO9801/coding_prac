class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        boolean check = true;
        int idx1 = 0;
        int idx2 = 0;
        for(String s : goal){
            if(idx1 < cards1.length && s.equals(cards1[idx1])){
                idx1++;
            }
            else if(idx2 < cards2.length && s.equals(cards2[idx2])){
                idx2++;
            }
            else{
                check = false;
                break;
            }
        }
        return check ? "Yes" : "No";
    }
}