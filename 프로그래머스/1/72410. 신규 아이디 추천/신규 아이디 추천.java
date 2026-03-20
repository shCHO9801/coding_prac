import java.util.*;

class Solution {
    public String solution(String new_id) {
        StringBuilder sb = new StringBuilder();
        String contain = "-_.";
        Deque<Character> dq = new ArrayDeque<>();
        
        for(char c : new_id.toCharArray()) {
            if(Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            }
            
            if(Character.isLowerCase(c) || Character.isDigit(c) || contain.contains(String.valueOf(c))){
                sb.append(c);
            }
        }
        
        new_id = sb.toString();
        
        if(new_id.length() != 0) {
            dq.addLast(new_id.charAt(0));
        
            for(int i = 1; i < new_id.length(); i++) {
                char cur = new_id.charAt(i);

                if(dq.peekLast() == '.' && cur == '.') {
                    continue;
                }

                dq.addLast(cur);
            }
        }
        
        while(!dq.isEmpty() && dq.peekFirst() == '.') {
            dq.pollFirst();
        }
        
        while(!dq.isEmpty() && dq.peekLast() == '.') {
            dq.pollLast();
        }
        
        if(dq.isEmpty()) {
            dq.addLast('a');
        }
        
        while(dq.size() >= 16) {
            dq.pollLast();
        }
        
        while(!dq.isEmpty() && dq.peekLast() == '.') {
            dq.pollLast();
        }
        
        while(dq.size() <= 2) {
            dq.addLast(dq.peekLast());
        }
        
        sb = new StringBuilder();
        while(!dq.isEmpty()) {
            sb.append(dq.pollFirst());
        }
        
        return sb.toString();
    }
}