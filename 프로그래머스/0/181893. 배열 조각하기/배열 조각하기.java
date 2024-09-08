import java.util.*;

class Solution {
    static ArrayList<Integer> list = new ArrayList<>();
    
    public static void removeBack(int n){
        int len = list.size() - n - 1;
        while(len-- > 0){
            list.remove(list.size() - 1);
        }
    }
    
    public static void removeFront(int n){
        while(n-- > 0){
            list.remove(0);
        }
    }
    
    public int[] solution(int[] arr, int[] query) {
        
        
        for(int n : arr){
            list.add(n);
        }
        
        for(int i = 0; i < query.length; i++){
            if(i % 2 == 0){
                removeBack(query[i]);
            } else {
                removeFront(query[i]);
            }
        }
        
        return list.stream().mapToInt(x -> x).toArray();
    }
}