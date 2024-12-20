import java.util.*;

class Solution {
    public class Music implements Comparable<Music>{
        int play;
        int idx;
        
        public Music (int play, int idx){
            this.play = play;
            this.idx = idx;
        }
        
        @Override
        public int compareTo(Music o) {
            if(this.play == o.play) {
                return this.idx - o.idx;
            } else {
                return o.play - this.play;
            }
        }
    }
    
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();
        Map<String, PriorityQueue<Music>> map = new HashMap<>();
        Map<String, Integer> genreCount = new HashMap<>();
        
        for(int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            genreCount.put(genre, genreCount.getOrDefault(genre, 0) + plays[i]);
            
            Music m = new Music(plays[i], i);
            if(!map.containsKey(genre)) {
                map.put(genre, new PriorityQueue<>());
            }
            map.get(genre).add(m);
        }
        
        List<String> genreKeys = new ArrayList<String>(genreCount.keySet());
        Collections.sort(genreKeys, (x, y) -> {
            return genreCount.get(y) - genreCount.get(x);
        });
        
        for(String key : genreKeys) {
            PriorityQueue<Music> music = map.get(key);
            int count = 0;
            
            while(!music.isEmpty() && count < 2) {
                answer.add(music.poll().idx);
                count++;
            }
        }
        return answer.stream().mapToInt(x -> x).toArray();
    }
}