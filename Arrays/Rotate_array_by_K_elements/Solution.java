package Arrays.Rotate_array_by_K_elements;

public class Solution 
{
    public static void main(String args[])
    {
        int[] nums = {3,1,5,7,33,11,56};
        int k=3;
        rotateLeft(nums, k);
    }

    public static void rotateLeft(int[] nums , int k)
    {
        int n=nums.length;
        k = k%n;
        
        for(int i=k;i<n;i++)
            System.out.print(nums[i] + " ");

        for(int i=0;i<k;i++)
            System.out.print(nums[i] + " ");
    }
    
}
