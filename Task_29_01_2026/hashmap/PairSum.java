package hashmap;

import java.util.HashSet;

public class PairSum {
    public boolean isPair(int[]nums,int target)
    {
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums)
        {
            int diff=target-num;
            if(set.contains(diff))
            {
                return true;
            }
            set.add(num);
        }
        return false;
    }

}
