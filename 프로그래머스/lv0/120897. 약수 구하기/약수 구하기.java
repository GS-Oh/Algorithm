class Solution {
    public int[] solution(int n) {
       
        int k = 0;
        
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                k++;
            }
        }
        
         int[] answer = new int[k];
        k=0;
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                answer[k] = i;
                k++;
            }
        }
        
        
        
        
        return answer;
    }
}