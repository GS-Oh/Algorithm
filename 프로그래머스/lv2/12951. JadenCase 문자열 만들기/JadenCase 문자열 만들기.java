class Solution {
    public String solution(String s) {
        String answer = "";
        
        s = s.toLowerCase();
		String[] splitS = s.split(" ");
		
		for (int i = 0; i < splitS.length; i++) {
			if(splitS[i].isEmpty()) {
                answer += " ";
				continue;
			}else if(i>0 && i != splitS.length){
				answer += " ";
			}
			
			char first = Character.toUpperCase((splitS[i].charAt(0)));
			splitS[i] = first +splitS[i].substring(1); 
			answer += splitS[i];
		}
        
        if( s.charAt(s.length()-1) == ' ') answer += " ";
               
        return answer;
    }
}