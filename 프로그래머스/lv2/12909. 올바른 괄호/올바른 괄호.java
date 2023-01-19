import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> bracket = new Stack<>();
	    
	    
	    for (int i = 0; i < s.length(); i++) {
			
	    	if(s.charAt(i) == '(') {
	    		bracket.push(s.charAt(i));
	    	}else if(s.charAt(i)==')' && bracket.isEmpty()) {
	    		bracket.push(s.charAt(i));
	    		break;
	    	}else {
	    		bracket.pop();
	    	}
	    	
		}
	    
	    answer = bracket.isEmpty() ? true : false;

        return answer;
    }
}