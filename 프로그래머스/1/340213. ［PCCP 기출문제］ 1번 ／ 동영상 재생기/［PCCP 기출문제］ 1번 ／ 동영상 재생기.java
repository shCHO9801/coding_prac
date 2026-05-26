class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        StringBuilder answer = new StringBuilder();
        
        int lenH = Integer.parseInt(video_len.split(":")[0]);
        int lenM = Integer.parseInt(video_len.split(":")[1]);
        
        int[] opStart = new int[] { 
            Integer.parseInt(op_start.split(":")[0]), Integer.parseInt(op_start.split(":")[1])
        };
        int[] opEnd = new int[] { 
            Integer.parseInt(op_end.split(":")[0]), Integer.parseInt(op_end.split(":")[1])
        };
        
        int curH = Integer.parseInt(pos.split(":")[0]);
        int curM = Integer.parseInt(pos.split(":")[1]);
        
        for(String com : commands) {
            
            if(isIntro(curH, curM, opStart, opEnd)) {
                curH = opEnd[0];
                curM = opEnd[1];
            }
            
            if(com.equals("prev")) {
                curM -= 10;
                if (curM < 0) {
                    if(curH - 1 < 0) {
                        curH = 0;
                        curM = 0;
                    } else {
                        curM += 60;
                        curH -= 1;    
                    }
                }
            } else if(com.equals("next")) {
                curM += 10;
                
                if(curM >= 60) {
                    curM -= 60;
                    curH += 1;
                }
                
                if(curH >= lenH && curM >= lenM) {
                    curH = lenH;
                    curM = lenM;
                }
            }
            
            if(isIntro(curH, curM, opStart, opEnd)) {
                curH = opEnd[0];
                curM = opEnd[1];
            }   
        }
        
        answer.append(curH < 10 ? "0" + curH : curH)
            .append(":")
            .append(curM < 10 ? "0" + curM : curM);
        
        return answer.toString();
    }
    
    private static boolean isIntro(int curH, int curM, int[] opStart, int[] opEnd) {
        int curTime = curH * 60 + curM;
        int opStartTime = opStart[0] * 60 + opStart[1];
        int opEndTime = opEnd[0] * 60 + opEnd[1];
        
        if(opStartTime <= curTime && curTime <= opEndTime) return true;
        return false;
    }
}