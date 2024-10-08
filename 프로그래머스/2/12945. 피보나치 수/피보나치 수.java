class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n == 1 || n == 2){
            return 1;
        }
        int[] arr = new int[n + 1];
        arr[1] = arr[2] = 1;
        
        for(int i = 3; i <= n; i++){
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1234567;
        }
        return arr[n];
    }
}