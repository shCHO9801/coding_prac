class Solution {
    static String makeBinary(int n, int len){
        String tmp = "";
        String result = "";
        while(n!=0){
            tmp += String.valueOf(n%2);
            n/=2;
        }
        while(tmp.length() < len)
            tmp+="0";
        for(int i = tmp.length() - 1; i >= 0; i--){
            result += tmp.charAt(i);
        }
        return result;
    }
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String [n];
        for(int i = 0; i < arr1.length; i++){
            answer[i] = makeBinary(arr1[i], n);
        }
        for(int i = 0; i < arr2.length; i++){
            String tmp = makeBinary(arr2[i], n);
            String result = "";
            for(int j = 0; j < answer.length; j++){
                if(tmp.charAt(j) == '1' || answer[i].charAt(j) == '1'){
                    result += '#';
                }
                else{
                    result += ' ';
                }
            }
            answer[i] = result;
        }
        return answer;
    }
}