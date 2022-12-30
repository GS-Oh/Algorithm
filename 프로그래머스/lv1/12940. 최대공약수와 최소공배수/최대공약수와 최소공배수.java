class Solution {
    public int[] solution(int n, int m) {
     
        int[] answer = {1, 0};
		
		if(n<m) {
			for (int i=1; i <= n; i++) {
				if(n%i == 0 && m%i == 0) {
					answer[0] = i;
				}
			}
			
			for(int j=m; j<=n*m; j++) {
				if(j%n == 0 && j%m == 0) {
					answer[1] = j;
					break;
				}
			}
		}else {
			for (int i=1; i <= m; i++) {
				if(n%i == 0 && m%i == 0) {
					answer[0] = i;
				}
			}
			
			for(int j=n; j<=n*m; j++) {
				if(j%n == 0 && j%m == 0) {
					answer[1] = j;
					break;
				}
			}
		}
        return answer;
    }
}