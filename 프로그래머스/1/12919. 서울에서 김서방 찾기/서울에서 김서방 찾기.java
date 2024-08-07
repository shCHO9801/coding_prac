import java.util.*;
class Solution {
    public String solution(String[] seoul) {
        List <String> list = new ArrayList<>(Arrays.asList(seoul));
        String find = "Kim";
        return String.format("김서방은 %d에 있다", list.indexOf(find));
    }
}