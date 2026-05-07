import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int score1 = 0, score2 = 0, score3 = 0;
        
        for(int i = 0; i < answers.length; i++){
            
            // no1 의 찍기신공
            switch((i + 1) % 5){
                case 1:
                    if(answers[i] == 1)
                        score1++;
                    break;
                case 2:
                    if(answers[i] == 2)
                        score1++;
                    break;
                case 3:
                    if(answers[i] == 3)
                        score1++;
                    break;
                case 4:
                    if(answers[i] == 4)
                        score1++;
                    break;
                case 0:
                    if(answers[i] == 5)
                        score1++;
                    break;
            }
            
            // no2 의 찍기신공
            switch((i + 1) % 8){
                case 1:
                    if(answers[i] == 2)
                        score2++;
                    break;
                case 2:
                    if(answers[i] == 1)
                        score2++;
                    break;
                case 3:
                    if(answers[i] == 2)
                        score2++;
                    break;
                case 4:
                    if(answers[i] == 3)
                        score2++;
                    break;
                case 5:
                    if(answers[i] == 2)
                        score2++;
                    break;
                case 6:
                    if(answers[i] == 4)
                        score2++;
                    break;
                case 7:
                    if(answers[i] == 2)
                        score2++;
                    break;
                case 0:
                    if(answers[i] == 5)
                        score2++;
                    break;
            }
            
            // no3 의 찍기신공
            switch((i + 1) % 10){
                case 1:
                    if(answers[i] == 3)
                        score3++;
                    break;
                case 2:
                    if(answers[i] == 3)
                        score3++;
                    break;
                case 3:
                    if(answers[i] == 1)
                        score3++;
                    break;
                case 4:
                    if(answers[i] == 1)
                        score3++;
                    break;
                case 5:
                    if(answers[i] == 2)
                        score3++;
                    break;
                case 6:
                    if(answers[i] == 2)
                        score3++;
                    break;
                case 7:
                    if(answers[i] == 4)
                        score3++;
                    break;
                case 8:
                    if(answers[i] == 4)
                        score3++;
                    break;
                case 9:
                    if(answers[i] == 5)
                        score3++;
                    break;
                case 0:
                    if(answers[i] == 5)
                        score3++;
                    break;
            }
        }
        
        int max = Math.max(score1, Math.max(score2, score3));
        
        ArrayList<Integer> list = new ArrayList<>();
        
        if(score1 == max) {
            list.add(1);
        }
        
        if(score2 == max) {
            list.add(2);
        }
        
        if(score3 == max) {
            list.add(3);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}