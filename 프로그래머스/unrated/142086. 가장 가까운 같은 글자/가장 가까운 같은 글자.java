import java.util.*;
class Solution {
    public int[] solution(String s) {
       int[] answer = new int[s.length()];
		StringBuilder sb = new StringBuilder();
		
		String check = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			check = String.valueOf(s.charAt(i));
			
			if(sb.lastIndexOf(check) == -1) {
				answer[i] = -1;
			}else {
				answer[i] = sb.length() - sb.lastIndexOf(check);
			}
			
			sb = sb.append(check);
			
		}
        
        return answer;
    }
}