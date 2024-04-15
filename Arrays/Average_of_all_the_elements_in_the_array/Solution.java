package Arrays.Average_of_all_the_elements_in_the_array;

public class Solution 
{
    public static void main(String arfs[])
    {
        int[] nums = {4,5,3,1,7,9,8};
        System.out.println("Average is " + findAverage(nums));
    }

    public static int findAverage(int[] nums)
    {
        int n = nums.length;
        int sum  =0;

        for(int i=0;i<n ;i++)
            sum+=nums[i];
        
        return sum/n;
        

    }
    
}
