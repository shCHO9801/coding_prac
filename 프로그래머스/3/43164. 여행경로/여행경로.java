import java.util.*;

class Solution {
    List<String> list = new ArrayList<>();
    
    public String[] solution(String[][] tickets) {
        String[] answer = {};
        boolean[] visited = new boolean[tickets.length];
        
        dfs("ICN", "ICN", 0, tickets, tickets.length, visited);
        
        Collections.sort(list);
        
        return list.get(0).split(" ");
    }
    
    private void dfs(String cur, String s, int count, String[][] tickets, int totalTicket, boolean[] visited) {
        if(count == totalTicket) {
            list.add(s);
            return;
        }
        
        for(int i = 0; i < totalTicket; i++) {
            if(tickets[i][0].equals(cur) && !visited[i]) {
                visited[i] = true;
                dfs(tickets[i][1], s + " " + tickets[i][1], count + 1, tickets, totalTicket, visited);
                visited[i] = false;
            }
        }
    }
}