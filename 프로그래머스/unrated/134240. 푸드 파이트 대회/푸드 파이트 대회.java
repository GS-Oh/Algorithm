class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder result = new StringBuilder();
	    
	    for (int i = 1; i < food.length; i++) {
			
	    	for (int j = 0; j < food[i]/2; j++) {
				result.append(i);
			}
		}
	    
	    answer = result.toString();
	    answer = answer + "0" + result.reverse().toString();
        return answer;
    }
}