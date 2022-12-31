import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
              
		
	    ArrayList<Integer> x = new ArrayList();
		
	    for (int i = 0; i < numbers.length; i++) {
			
	    	for (int j = i+1; j < numbers.length; j++) {
				
	    		if(!x.contains(numbers[i]+numbers[j])) {
						x.add(numbers[i]+numbers[j]);
					}
			}
		}
	    
	    int[] answer = x.stream().mapToInt(i -> i).toArray();
	    
	    Arrays.sort(answer);
        
        
        
        return answer;
    }
}