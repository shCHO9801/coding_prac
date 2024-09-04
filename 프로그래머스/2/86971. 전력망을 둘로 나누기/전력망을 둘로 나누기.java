import java.util.*;

class Node{
    int from;
    int to;
    public Node(int from, int to){
        this.from = from;
        this.to = to;
    }
}

class Solution {
    static Map<Integer, ArrayList<Node>> graph = new HashMap<>();

    public static int bfs(int n, Node skip){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];

        queue.add(1);
        visited[1] = true;
        int cnt = 1;

        while(!queue.isEmpty()){
            int cur = queue.poll();
            for(Node edge : graph.get(cur)){
                int from = edge.from;
                int to = edge.to;

                if(from == skip.from && to == skip.to) continue;
                if(from == skip.to && to == skip.from) continue;

                int adj = cur == from ? to : from;
                if(!visited[adj]){
                    visited[adj] = true;
                    queue.add(adj);
                    cnt++;
                }
            }
        }
        return cnt;
    }


    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;

        for(int i = 1; i <= n; i++){
            graph.put(i, new ArrayList<>());
        }

        for(int[] wire : wires){
            Node node = new Node(wire[0], wire[1]);
            graph.get(wire[0]).add(node);
            graph.get(wire[1]).add(node);
        }

        for(int[] wire : wires){
            Node skip = new Node(wire[0], wire[1]);

            int firstGraphCount = bfs(n, skip);
            int secondGraphCount = n - firstGraphCount;
            int diff = Math.abs(firstGraphCount - secondGraphCount);

            answer = Math.min(answer, diff);
        }

        return answer;
    }
}