package Arrays.Calculate_Sum_of_the_Elements_of_the_Array;

public class Solution 
{

    public static void main(String ards[])
    {
        int nums[] = {1,2,3,4,5};
        System.out.println("Sum is " + sumOfElements(nums));

    }

    public static int sumOfElements(int[] nums)
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
            sum+=nums[i];
        
        return sum;
    }
    
}
