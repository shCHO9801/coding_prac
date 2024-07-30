class Solution {
    public int[] solution(int[] arr, int n) {
        int leng = arr.length;
        int i = 0;
        if(leng%2==0)
            i = 1;
        for(;i<leng;i+=2) arr[i] += n;
        return arr;
    }
}