class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int x=0;
        int y=0;

        for(int i=0; i < s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) =='P'){
                x++;
            }else if(s.charAt(i)=='y' || s.charAt(i)=='Y'){
                y++;
            }
        }

        if(x==y) {
            answer=true;
        }else answer = false;

        return answer;
    }
}