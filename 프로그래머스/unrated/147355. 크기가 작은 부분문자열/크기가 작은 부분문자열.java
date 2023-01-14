class Solution {
    public int solution(String t, String p) {
   
        int answer = 0;
	        
		/*
		 * 0부터 t.length() - p.length() 까지 반복
		 * 잘라서 비교해서 체크
		 */
		
		int pLength = p.length();
		long compareValue = 0;
		long baseValue = Long.parseLong(p);
		
		for (int i = 0; i <= t.length() - pLength; i++) {
			
			compareValue = Long.parseLong(t.substring(i,i+pLength));
			
			if(compareValue <= baseValue ) answer++;
			
		}
        
        
        return answer;
    }
}