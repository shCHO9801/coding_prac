class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1) return new int[]{-1};
        int[] answer = new int[arr.length-1];
        int min = arr[0], idx = 0;
        for(int i : arr)
            min = Math.min(min,i);
        for(int i : arr){
            if(i==min) continue;
            answer[idx++] = i;
        }
        return answer;
    }
}