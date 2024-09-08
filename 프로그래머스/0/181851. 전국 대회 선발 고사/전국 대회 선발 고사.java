import java.util.*;
class Student implements Comparable <Student> {
    int idx;
    int rank;
    
    public Student(int idx, int rank){
        this.idx = idx;
        this.rank = rank;
    }
    
    @Override
    public int compareTo(Student o){
        return this.rank - o.rank;
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
        
        Collections.sort(list);
        
        answer = 10000 * list.get(0).idx + 100 * list.get(1).idx + 1 * list.get(2).idx;
        
        return answer;
    }
}