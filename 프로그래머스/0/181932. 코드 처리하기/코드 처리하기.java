class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        
        boolean mode = false;
        int idx = 0;
        
        while(idx < code.length()){
            char tmp = code.charAt(idx);
            
            if(!mode){
                if(tmp != '1'){
                    if(idx % 2 == 0) {
                        sb.append(tmp);
                    } 
                } else {
                    mode = true;
                }
            } else {
                if(tmp != '1'){
                    if(idx % 2 != 0) {
                        sb.append(tmp);
                    } 
                }else {
                    mode = false;
                }
            }
            
            idx++;
        }
        return sb.length() == 0 ? "EMPTY" : sb.toString();
    }
}