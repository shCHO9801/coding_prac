class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if(arr1.length > arr2.length) return 1;
        if(arr1.length < arr2.length) return -1;
        int a = 0, b = 0;
        for(int x : arr1) a+=x;
        for(int x : arr2) b+=x;
        if(a==b) return 0;
        return a>b?1:-1;
    }
}