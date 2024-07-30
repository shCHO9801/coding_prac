import java.util.*;
class Solution {
    public int[] solution(String myString) {
        String[] tmp = myString.split("x");
        List <Integer> answer = new ArrayList<>();
        for(int i = 0; i<tmp.length;i++)
            System.out.println(tmp[i]);
        for (String i : tmp)
            answer.add(i.length());
        if(myString.charAt(myString.length()-1) == 'x')
            answer.add(0);
        return answer.stream().mapToInt(i->i).toArray();
    }
}