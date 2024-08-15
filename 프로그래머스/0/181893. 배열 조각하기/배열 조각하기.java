import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        Deque<Integer> list = new ArrayDeque<>();
        for (int i : arr) {
            list.add(i);
        }
        for (int i = 0; i < query.length; i++) {
            int len = list.size();
            int q = query[i];
            if (i % 2 == 0) {
                for (int j = 1; j < len - q; j++) {
                    list.pollLast();
                }
            } else {
                for (int j = 0; j < q; j++) {
                    list.pollFirst();
                }
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.pollFirst();
        }
        return answer;
    }
}