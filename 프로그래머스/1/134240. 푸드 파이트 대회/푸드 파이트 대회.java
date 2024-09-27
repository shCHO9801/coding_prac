class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i < food.length; i++){
            for(int j = 0; j < food[i] / 2; j++){
                sb.append(i);
            }
        }
        
        StringBuilder sbReverse = new StringBuilder();
        sbReverse.append(sb).reverse();
        sb.append('0').append(sbReverse);
        return sb.toString();
    }
}