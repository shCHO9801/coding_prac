import java.util.*;
class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        int n = arr.length;
        int m = arr[0].length;
        if(n==m)return arr;
        int max = Math.max(n,m);
        answer = new int[max][max];
        for(int i = 0;i<arr.length;i++)
            for(int j = 0;j<arr[i].length;j++)
                answer[i][j] = arr[i][j];
        return answer;
    }
}