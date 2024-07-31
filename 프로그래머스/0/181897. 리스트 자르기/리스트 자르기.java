import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List <Integer> answer = new ArrayList<>();
        int s = 0,e = 0,len, idx = 0;
        int c = 1;
        if(n == 1){
            s = 0;
            e = slicer[1];
        }
        else if(n == 2){
            s = slicer[0];
            e = num_list.length-1;
        }
        else if(n==3 || n ==4){
            s = slicer[0];
            e = slicer[1];
        }
        if(n==4) c = slicer[2];
        for(int i = s; i <= e; i += c)
            answer.add(num_list[i]);
        return answer.stream().mapToInt(i->i).toArray();
    }
}