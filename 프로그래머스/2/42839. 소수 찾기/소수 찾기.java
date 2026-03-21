import java.util.*;

class Solution {
    static Set<Integer> set;
    public int solution(String numbers) {
        int answer = 0;
        set = new TreeSet<>();
        char[] cArr = numbers.toCharArray();
        boolean[] visited = new boolean[cArr.length];
        
        dfs("", visited, cArr);
        
        for(int n : set) {
            if (isPrime(n)) answer++;
        }
        
        return answer;
    }
    
    private void dfs(String s, boolean[] visited, char[] cArr) {
        if(!s.isEmpty()) {
            set.add(Integer.parseInt(s));
        }
        
        for(int i = 0; i < cArr.length; i++) {
            if(visited[i]) continue;
            
            visited[i] = true;
            dfs(s + cArr[i], visited, cArr);
            visited[i] = false;
        }
    }
    
    private boolean isPrime(int n) {
        if(n < 2) return false;
        
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) return false;
        }
        
        return true;
    }
}