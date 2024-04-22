package Numbers.Find_all_Palindrome_Numbers_in_a_given_range;

public class Solution 
{
    public static void main(String args[])
    {
        int min =50;
        int max = 100;

        for(int i=min;i<=max;i++)
            {
                if(isPalindrome(i))
                    System.out.print(i + " ");
            }
    }

    public static boolean isPalindrome(int num)
    {
        int d =0;
        int rev =0;
        int nums = num;
        while(num > 0)
        {
            d  = num%10;
            rev = rev * 10 + d;
            num = num/10;

        }
       
        if(rev==nums)  return true;
    
        return false;


    }


}
