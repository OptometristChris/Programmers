import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> cmap = new HashMap<String, Integer>();
        
        for(int i=0; i<clothes.length; i++){
            cmap.put(clothes[i][1], cmap.getOrDefault(clothes[i][1], 0)+1);
            //System.out.println(clothes[i][1]);
        }
        
        
        for(String str : cmap.keySet()){
            System.out.println(cmap.get(str));
            answer *= cmap.get(str) + 1;
        }
        
        
        return answer-1;
    }
}