import java.util.*;
class Solution {
    public class Info{
        int code;
        int date;
        int maximum;
        int remain;
        public Info(int code, int date, int maximum, int remain){
            this.code = code;
            this.date = date;
            this.maximum = maximum;
            this.remain = remain;
        }
    }
    
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<Info> list = new ArrayList<>();
        
        int[][] answer = {};
        int dataType = 0;
        int sortType = 0;
        
        if(ext.equals("code")){
            dataType = 0;
        } else if(ext.equals("date")){
            dataType = 1;
        } else if(ext.equals("maximum")){
            dataType = 2;
        } else{
            dataType = 3;
        }
        
        if(sort_by.equals("code")){
            sortType = 0;
        } else if(sort_by.equals("date")){
            sortType = 1;
        } else if(sort_by.equals("maximum")){
            sortType = 2;
        } else{
            sortType = 3;
        }
        
        for(int[] d : data){
            if(d[dataType] < val_ext){
                list.add(new Info(d[0], d[1], d[2], d[3]));
            }
        }
        if(sortType == 0){
            Collections.sort(list, (x, y) -> x.code - y.code);    
        } else if(sortType == 1){
            Collections.sort(list, (x, y) -> x.date - y.date);    
        } else if(sortType == 2){
            Collections.sort(list, (x, y) -> x.maximum - y.maximum);    
        } else{
            Collections.sort(list, (x, y) -> x.remain - y.remain);
        }
        
        answer = new int[list.size()][4];
        
        for(int i = 0; i < list.size(); i ++){
            answer[i][0] = list.get(i).code;
            answer[i][1] = list.get(i).date;
            answer[i][2] = list.get(i).maximum;
            answer[i][3] = list.get(i).remain;
        }
        
        return answer;
    }
}