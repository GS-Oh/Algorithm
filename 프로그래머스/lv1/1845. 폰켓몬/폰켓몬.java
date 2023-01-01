import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int choice = nums.length / 2 ;
		int check = 0;
		
		int[] arr = new int[choice];
		
		for (int i = 0; i < nums.length; i++) {
			int temp = nums[i];
			if(!Arrays.stream(arr).anyMatch(k -> k == temp) && check<choice) {
				arr[check] = nums[i];
				check ++;
			}
		}
        
        if(choice > check) {
			answer = check;
		}else {
            answer = choice;
        }
        
        
        return answer;
    }
}