class Solution {
    static int odd,even;
    public int solution(int[] num_list) {
        for(int i = 0; i<num_list.length;i++){
            if(i%2==0) even+=num_list[i];
            else odd+=num_list[i];
        }
        return even>odd?even:odd;
    }
}