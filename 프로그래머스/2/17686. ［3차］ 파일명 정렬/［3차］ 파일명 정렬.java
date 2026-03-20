import java.util.*;

class Solution {
    public class File implements Comparable <File>{
        String rawFileName;
        int index;
        String head;
        int number;
        
        public File(String rawFileName, int index) {
            this.rawFileName = rawFileName;
            this.index = index;
            
            int headIdx = 0;
            while(!Character.isDigit(rawFileName.charAt(++headIdx)));
            
            int numberIdx = headIdx;
            for(; numberIdx < rawFileName.length(); numberIdx++) {
                if(!Character.isDigit(rawFileName.charAt(numberIdx))) {
                    break;
                }
            }
            
            this.head = rawFileName.substring(0, headIdx).toLowerCase();
            String number = rawFileName.substring(headIdx, numberIdx);
            this.number = Integer.parseInt(number);
        }
        
        @Override
        public int compareTo(File f) {
            if(!this.head.equals(f.head)) {
                return this.head.compareTo(f.head);
            }
            
            if(this.number != f.number) {
                return this.number - f.number;
            }
            
            return this.index - f.index;
        }
    }
    
    public String[] solution(String[] files) {
        String[] answer = new String[files.length];
        
        PriorityQueue<File> list = new PriorityQueue<>();
        int idx = 0;
        
        for(String file : files) {
            File curFile = new File(file, idx++);
            list.add(curFile);
        }
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.poll().rawFileName;
        }
        
        return answer;
    }
}