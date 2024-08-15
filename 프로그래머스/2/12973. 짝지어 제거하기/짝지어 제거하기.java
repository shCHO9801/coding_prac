import java.util.*;
class Solution
{
    public int solution(String s)
    {
        Stack stack = new Stack();
        for(String st : s.split("")){
            if(!stack.isEmpty() && stack.peek().equals(st)){
                stack.pop();
            }
            else{
                stack.push(st);
            }
        }
        
        return stack.size() == 0 ? 1 : 0;
    }
}