class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        new_id = new_id.toLowerCase();
        StringBuilder sb = new StringBuilder();
        
        for(char c : new_id.toCharArray()) {
            if(Character.isDigit(c) || Character.isLowerCase(c) || c == '-' || c == '_' || c == '.') {
                sb.append(c);
            }
        }
        
        new_id = sb.toString();
        sb = new StringBuilder();
        
        char cur = new_id.charAt(0);
        for(int i = 1; i < new_id.length(); i++) {
            if(cur == new_id.charAt(i) && cur == '.') {
                continue;
            } else {
                sb.append(cur);
                cur = new_id.charAt(i);

            }
        }
        
        sb.append(cur);
        new_id = sb.toString();
        if(new_id.length() > 0 && new_id.charAt(0) == '.') {
            new_id = new_id.substring(1,new_id.length());
        }
        if(new_id.length() > 0 && new_id.charAt(new_id.length() - 1) == '.') {
            new_id = new_id.substring(0, new_id.length() - 1);
        }
        
        if(new_id.length() == 0) new_id += "a";
        
        if(new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            if(new_id.length() > 0 && new_id.charAt(new_id.length() - 1)  == '.') {
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }
        
        while(new_id.length() <= 2) {
            new_id += String.valueOf(new_id.charAt(new_id.length() - 1));
        }
        
        return new_id;
    }
}