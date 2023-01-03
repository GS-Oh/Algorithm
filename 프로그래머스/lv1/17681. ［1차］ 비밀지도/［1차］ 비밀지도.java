class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
         String[] answer = new String[n];
	    StringBuilder temp = new StringBuilder();
	    
	    
	    for (int i = 0; i < n; i++) {
			for(int j=0; j<n; j++) {
		    	if(arr1[i]%2 == 0 && arr2[i]%2 == 0) {
		    		arr1[i] /= 2;
		    		arr2[i] /= 2;
		    		temp.insert(0," ");
		    	}else { 
		    		arr1[i] /= 2;
		    		arr2[i] /= 2;
		    		temp.insert(0,"#");
		    	}
	    	}
	    	
			answer[i]=temp.toString();
			temp.setLength(0);
        }
           
        return answer;
    }
}