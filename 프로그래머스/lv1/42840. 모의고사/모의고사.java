import java.util.*;
 
class Solution {
    public int[] solution(int[] answers) {
        
        //수포자 셋의 패턴.각각 5개, 8개, 10개씩 반복됨
        int[] person1 = {1,2,3,4,5};
        int[] person2 = {2,1,2,3,2,4,2,5};
        int[] person3 = {3,3,1,1,2,2,4,4,5,5};
        
        //정답을 몇 개 맞추는 지 넣을 배열
        int[] cnt = new int[3];
        
        for(int i=0;i<answers.length;i++){
            if(answers[i] == person1[i%person1.length]){cnt[0]++;}
            if(answers[i] == person2[i%person2.length]){cnt[1]++;}
            if(answers[i] == person3[i%person3.length]){cnt[2]++;}
        }
        
        //가장 많이 맞은 문제 개수 찾기
        int max = Math.max(Math.max(cnt[0],cnt[1]),cnt[2]); 
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        //가장 많이 맞은 사람 
        if(max == cnt[0]){list.add(1);}
        if(max == cnt[1]){list.add(2);}
        if(max == cnt[2]){list.add(3);}
        
        int[] answer = new int[list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}