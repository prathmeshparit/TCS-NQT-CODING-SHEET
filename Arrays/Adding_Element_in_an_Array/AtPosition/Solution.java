package Arrays.Adding_Element_in_an_Array.AtPosition;



public class Solution {
    public static void main(String arfs[])
    {
        int nums[] = {1,2,3,4,0};
        int n=4;
        int value = 9;
        int pos=2;
        for(int i : nums)
        System.out.print(" " + i);
        insert(nums, n,value,pos);
        
        System.out.println(" ");

        for(int j : nums)
       System.out.print(" " + j);

    }

    public static void insert(int nums[] , int n , int value,int pos)
    {
        for(int i = n-1 ; i >=pos;i--)
            nums[i+1] = nums[i];
        nums[pos] = value;
        
    }

}
