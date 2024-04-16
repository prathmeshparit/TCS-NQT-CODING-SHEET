package Arrays.Remove_Duplicates_inplace_from_Sorted_Array;

public class Solution
{
    public static void main(String arfd[])
    {
        int[] nums = {1,2,2,3,5,5,6,7,8,8,9};
      int j=  removeDuplicates(nums);
      for(int k=0 ;k<j;k++)
            System.out.print(nums[k] + " ");

    }

    public static int removeDuplicates(int[] nums)
    {
        int n = nums.length;
        int i=0;

        for(int j=1; j< n;j++)
        {
            if(nums[i] !=nums[j])
            {
                i++;
                nums[i] = nums[j];
            }
        }
        
        return i+1;
        
      

    }
    
}
