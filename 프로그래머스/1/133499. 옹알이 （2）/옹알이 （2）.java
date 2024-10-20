import java.util.*;

class Solution {
    static List<String> bab;
    
    public static void makeBab(){
        String[] b = {"aya", "ye", "woo", "ma"};
        bab = new ArrayList<>(Arrays.asList(b));
    }
    
    public static boolean isBabbling(String s){
        StringBuilder tmp = new StringBuilder();
        String prev = "";
        
        for(char c : s.toCharArray()){
            tmp.append(c);
            
            if(bab.contains(tmp.toString())){
                if(prev.equals(tmp.toString())){
                    return false;
                } else {
                    prev = tmp.toString();
                    tmp = new StringBuilder();
                }
            }
        }
        
        return tmp.length() == 0 ? true : false;
    }
    
    public int solution(String[] babbling) {
        int answer = 0;
        makeBab();
        
        for(String s : babbling){
            if(isBabbling(s)){
                answer++;
            }
        }
        return answer;
    }
}