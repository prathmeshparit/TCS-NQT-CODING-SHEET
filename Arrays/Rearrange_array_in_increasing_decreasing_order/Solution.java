package Arrays.Rearrange_array_in_increasing_decreasing_order;
import java.util.Arrays;
public class Solution 
{

    public static void main(String args[])
    {
        int arr[] = {3,2,7,87,8,4,9,12,3};
        reArrange(arr);
    }

    public static void reArrange(int[] nums)
    {
        int n = nums.length;
        Arrays.sort(nums);

        for(int i=0;i < n/2 ;i++)
            System.out.print(nums[i] + " ");

        
        for(int i=n-1;i > n/2 ;i--)
            System.out.print(nums[i] + " ");
    }

    
    
}
