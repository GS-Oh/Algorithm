import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int num = 0;
        for (int i = 1; i < arr.length; i++) {
			if(!(arr[i] == arr[i-1])) {
				num ++;
			}
		}
		
		int[] answer = new int[num+1];
		
		num = 1;
		for (int i = 1; i < arr.length; i++) {
			answer[0] = arr[0];
			if(!(arr[i] == arr[i-1])) {
				answer[num] = arr[i];
				num++;
			}
		}

        return answer;
    }
}