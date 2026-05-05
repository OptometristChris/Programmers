import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        
        for(int i=0; i<commands.length; i++){
            int s=0, e=0, k=0;
            s = commands[i][0] - 1;
            e = commands[i][1];
            k = commands[i][2] - 1;
            
            int[] newarr = Arrays.copyOfRange(array, s, e);
            
            Arrays.sort(newarr);
            
            answer[i] = newarr[k];
        }
        
        return answer;
    }
}