package Numbers.Check_if_a_number_is_Palindrome_or_Not;

public class Solution 
{
    public static void main(String args[])
    {
            int num =121;
           
            System.out.println("Number is Palindrome : "  +  isPalindrome(num));
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
        System.out.println(rev);
        if(rev==nums)  return true;
    
        return false;


    }


}
