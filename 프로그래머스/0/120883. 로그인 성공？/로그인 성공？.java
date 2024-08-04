class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        for(String[] l : db){
            if(id_pw[0].equals(l[0]) && id_pw[1].equals(l[1])){
                answer = "login";
                break;
            }
            else if(id_pw[0].equals(l[0]))
                answer = "wrong pw";
        }
        return answer;
    }
}