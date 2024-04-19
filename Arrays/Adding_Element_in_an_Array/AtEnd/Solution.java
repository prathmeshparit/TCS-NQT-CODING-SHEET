package Arrays.Adding_Element_in_an_Array.AtEnd;



public class Solution {
    public static void main(String arfs[])
    {
        int nums[] = {1,2,3,4,0};
        int n=4;
        int value = 9;

        for(int i : nums)
        System.out.print(" " + i);
        insert(nums, n,value);
        
        System.out.println(" ");

        for(int j : nums)
       System.out.print(" " + j);

    }

    public static void insert(int nums[] , int n , int value)
    {
       nums[n] = value;
        
    }

}
