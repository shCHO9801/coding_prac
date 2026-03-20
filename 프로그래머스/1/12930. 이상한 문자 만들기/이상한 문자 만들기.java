class Solution {
    public String solution(String ss) {
        StringBuilder answer = new StringBuilder();
        
        String[] split = ss.split(" ", -1);
        
        for(int i = 0; i < split.length; i++) {
            
            String s = split[i];
            System.out.println(s);
            
            StringBuilder tmp = new StringBuilder();
            
            for(int j = 0; j < s.length(); j++) {
                if(j % 2 == 0) {
                    tmp.append(Character.toUpperCase(s.charAt(j)));
                } else {
                    tmp.append(Character.toLowerCase(s.charAt(j)));
                }
            }
            
            answer.append(tmp);
            
            if(i < split.length - 1) {
                answer.append(' ');
            }
        }
        
        if(answer.length() != ss.length()) {
            answer.append(' ');
        }
        
        return answer.toString();
    }
}