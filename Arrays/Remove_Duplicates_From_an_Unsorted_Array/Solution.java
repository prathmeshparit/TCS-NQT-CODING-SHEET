package Arrays.Remove_Duplicates_From_an_Unsorted_Array;
import java.util.*;

public class Solution 
{
    public static void main(String args[])
    {
            int  nums[] = {3,22,22,5,7,8,2,2,1,1};
            sorted(nums);
    }

    public static void sorted(int[] nums)
    {
            Set<Integer> set = new HashSet<>();

            for(int n : nums)
            {
              //  if(!set.contains(n))
                    set.add(n);
            }

            

            // for(int n : set)
            //     System.out.print(n + " ");

            set.toArray();
            System.out.println(set);
    }
    
}
