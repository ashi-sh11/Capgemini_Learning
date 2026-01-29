package hashmap;

import java.util.HashMap;

public class TwoSum {
    public static int[] findIndices(int[]nums,int target)
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int diff=target-nums[i];
            if(map.containsKey(diff))
            {
                return new int[]{map.get(nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
