class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        int left = -1, right = -1, idx = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i] == 2){
                if(left == -1)
                    left = right = i;
                else right = i;
            }
        }
        if(left == -1) return new int[]{-1};
        answer = new int[right-left+1];
        for(int i = left; i <= right; i++){
            answer[idx++] = arr[i];
        }
        return answer;
    }
}