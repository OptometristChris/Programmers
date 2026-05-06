class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int[] sol = new int[2];
        sol[0] = 0; sol[1] = 0;
        
        for(int i=0; i<sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]) {
                int temp = 0;
                temp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = temp;
            }
            if(sol[0] < sizes[i][0]){
                int temp = 0;
                temp = sizes[i][0];
                sizes[i][0] = sol[0];
                sol[0] = temp;
            }
            if(sol[1] < sizes[i][1]){
                int temp = 0;
                temp = sizes[i][1];
                sizes[i][1] = sol[1];
                sol[1] = temp;
            }
        }
        answer = sol[0] * sol[1];
        
        return answer;
    }
}