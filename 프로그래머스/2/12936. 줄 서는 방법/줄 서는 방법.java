import java.util.*;

class Solution {
    
    static int[] answer;
    static int cnt = 0;
    
    public static void combi(boolean[] visited, int[] people, int n, long k){
        if(cnt == n){
            return ;
        }
        
        long fact = factorial(n - cnt - 1);
        for(int i = 1; i <= n; i++){
            if(!visited[i]){
                if(k > fact){
                    k -= fact;
                } else {
                    visited[i] = true;
                    answer[cnt++] = people[i];
                    combi(visited, people, n, k);
                    return;
                }
            }
        }
    }
    
    public static long factorial(int n){
        if(n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
    
    public int[] solution(int n, long k) {
        
        answer = new int[n];
        int[] people = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        
        for(int i = 1; i<=n; i++){
            people[i] = i;
        }
        combi(visited, people, n, k);
        
        
        return answer;
    }
}