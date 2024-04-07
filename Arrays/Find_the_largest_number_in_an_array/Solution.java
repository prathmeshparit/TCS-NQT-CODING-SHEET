package Arrays.Find_the_largest_number_in_an_array;
public class Solution
{
    public static int findLargest(int nums[])
    {
        int largest = nums[0];

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] > largest)
                largest = nums[i];
        }

        return largest;
    }

    public static void main(String args[])
    {
        int arr[] = {3,2,7,87,8,4,9,12,3};
        int l = findLargest(arr);
        System.out.println(l);

    }

}
