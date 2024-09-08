import java.util.*;
class Student{
    int idx;
    int rank;
    public Student(int idx, int rank){
        this.idx = idx;
        this.rank = rank;
    }
}
class Solution {
    
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Student> list = new ArrayList<>();
        
        for(int i = 0; i < rank.length; i++){
            if(attendance[i]){
                list.add(new Student(i, rank[i]));
            }
        }
        
        Collections.sort(list, (x, y) -> x.rank - y.rank);
        
        int mul = 10000;
        
        for(int i = 0; i < 3; i++){
            answer += mul * list.get(i).idx;
            mul /= 100;
        }
        
        
        return answer;
    }
}