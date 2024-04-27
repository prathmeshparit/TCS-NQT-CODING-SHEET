package String.Check_if_the_given_String_is_Palindrome_or_not;

public class Solution 
{
    public static void main(String args[])
    {
        String s1 = "abpba";
        System.out.println(Palindrome(s1));
    }

    public static String Palindrome(String str)
    {
        int n = str.length();
        String ans="YES";
        int left = 0;
        int right = n-1;
        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right) )
            {
                ans="NO";
                break;
            }
            else{
                left++;
                right--;
            }
        }

        return ans;
    }
    
}
