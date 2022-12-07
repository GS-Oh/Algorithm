import java.util.ArrayList;

class Solution
{

    public int[] solution(int[] arr)
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        int min = Integer.MAX_VALUE;
        
        for (int item : arr)
        {
            min = Math.min(min, item);
            
            list.add(item);
        }
        
        list.remove((Integer) min);
        
        // 리스트가 비었을 경우
        if (list.isEmpty())
        {
            list.add(-1);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}