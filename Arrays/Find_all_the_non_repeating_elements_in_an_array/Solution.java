package Arrays.Find_all_the_non_repeating_elements_in_an_array;


import java.util.*;

public class Solution 
{
    public static void main(String args[])
    {
        int nums[] = {1,1,2,3,4,4,5,6,7,7};
        repeatingNums(nums);
    }

    public static void repeatingNums(int nums[])
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums)
        {
            if(map.containsKey(n))
                map.put(n,map.get(n)+1);
            else
                map.put(n,1);
        }


        for(int n : map.keySet())
        {
            if(map.get(n) == 1)
                System.out.print( n + " ");
        }
    }

}
