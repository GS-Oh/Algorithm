import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int count = 0 ;
		
		for(int x : arr) {
			if(x%divisor == 0) count++;
		};
		
        if(count == 0){
            int[] answer = {-1};
            return answer;
        }
		
		int[] answer = new int[count];
		int i = 0;
        
		for(int x : arr) {
			if(x%divisor == 0) {
				answer[i] = x;
				i++;
			};
		};
		
		Arrays.sort(answer);
        
        return answer;
    }
}