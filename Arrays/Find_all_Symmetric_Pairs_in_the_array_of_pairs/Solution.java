package Arrays.Find_all_Symmetric_Pairs_in_the_array_of_pairs;

import java.util.HashMap;

public class Solution 
{
    public static void main(String args[])
    {
        int nums[][] = { {1,2}, {2,1},{3,4},{4,5} ,{5,4}};
        symmetricPairs(nums);
    }

    public static void symmetricPairs(int nums[][])
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int f = nums[i][0];
            int s = nums[i][1];

            if(map.get(s)!=null && map.get(s)==f)
                System.out.print("(" + f + "," + s + ")  ");
            else
                map.put(f, s);
        }
    }

}
