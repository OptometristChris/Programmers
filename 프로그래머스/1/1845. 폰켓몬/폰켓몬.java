import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = nums.length/2;
        
        Arrays.sort(nums);
        
        HashSet<Integer> hset = new HashSet<>();

        for(int num : nums) {
            hset.add(num);
        }
        
        if(answer >= hset.size()){
            return hset.size();
        }
        return answer;
    }
}