import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : score){
            list.add(i);
        }
        Collections.sort(list, (x,y) -> {
            return y-x;
        });
        for(int i = m-1; i < score.length; i+=m){
            answer += list.get(i) * m;
        }
        return answer;
    }
}