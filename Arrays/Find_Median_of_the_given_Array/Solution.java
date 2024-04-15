package Arrays.Find_Median_of_the_given_Array;
import java.util.Arrays;

public class Solution 
{
   public static void main(String arfs[])
   {
    int nums[] = {2,4,1,5};
    System.out.println("Medain is :" + findMedain( nums));
   }
   
   public static int findMedain(int[] nums)
   {
        int n = nums.length;
        Arrays.sort(nums);

        if(n%2==0)
            return ((nums[n/2] + nums[n/2-1])/2);
        

        return nums[n/2];
   }
}
