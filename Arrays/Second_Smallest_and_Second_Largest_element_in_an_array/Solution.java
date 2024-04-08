package Arrays.Second_Smallest_and_Second_Largest_element_in_an_array;
import java.util.Arrays;
public class Solution 
{
    public static void main(String args[])
    {
        int arr[] = {2,6,22,9,8,5,7,66,32,11};
        System.out.println(" second Smallest :" + findSSmallest(arr));
        System.out.println("second Largest:" + findSLargest(arr));
    }

    public static int findSSmallest(int[] nums)
    {
        Arrays.sort(nums);
        return nums[1];
    }

    public static int  findSLargest(int[] nums)
    {
        Arrays.sort(nums);
        return nums[nums.length-2];

    }
}
