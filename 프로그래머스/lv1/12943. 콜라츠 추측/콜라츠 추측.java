class Solution {
    public long solution(long num) {
        long answer = 0;
        
        for (int i = 0; i < 500; i++) {

            if(num == 1) {
				break;
			}
                        
			if( num % 2 == 0) {
				num /= 2;
				answer++;
				
			}else {
				num = (num * 3) + 1;
				answer++;
			}         
            
			
		}    
        
        if (num != 1) {
            answer = -1;
        }
        
        
        return answer;
    }
}