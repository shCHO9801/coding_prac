class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        char[] arr = s.toCharArray();
        boolean first = true;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == ' ') {
                first = true;
                sb.append(arr[i]);
            } else if(Character.isDigit(arr[i])) {
                first = false;
                sb.append(arr[i]);
            } else {
                if(first) {
                    sb.append(Character.toUpperCase(arr[i]));
                    first = false;
                }
                else sb.append(Character.toLowerCase(arr[i]));
            }
        }
        
        return sb.toString();
    }
}