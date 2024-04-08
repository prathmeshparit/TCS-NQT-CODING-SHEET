package Arrays.Reverse_a_given_Array;

public class Solution 
{
    
    public static void main(String args[])
    {
        int arr[] = {2,6,22,9,8,5,7,66,32,11};
        
        arr =   reverse(arr);

        for(int i =0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
       
    }

    public static int[] reverse(int[] nums)
    {
        int start=0;
        int end = nums.length-1;

        while(start < end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        return nums;
    }
}
