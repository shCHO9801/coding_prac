class Solution {
    public String solution(String my_string, String alp) {
        return my_string.replaceAll(alp,Character.toUpperCase(alp.charAt(0))+"");
    }
}