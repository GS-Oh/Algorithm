class Solution
{

    public String solution(String s)
    {
        String[] answer = s.split("");
        
        int index = 0;
        
        for (int i = 0; i < answer.length; i++)
        {
            // 공백일 경우
            if (answer[i].equals(" "))
            {
                index = 0;
                answer[i] = " ";
            }
            
            // 문자열일 경우
            else
            {
                // 짝수 인덱스일 경우
                if (index % 2 == 0)
                {
                    answer[i] = answer[i].toUpperCase();
                }
                
                // 홀수 인덱스일 경우
                else
                {
                    answer[i] = answer[i].toLowerCase();
                }
                
                index++;
            }
        }
        
        return String.join("", answer);
    }
}