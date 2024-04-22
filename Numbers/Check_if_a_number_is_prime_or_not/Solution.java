package Numbers.Check_if_a_number_is_prime_or_not;

public class Solution 
{

    public static void main(String args[])
    {
        int num=6;
        System.out.print("Prime number : " + isPrime(num));
    }

    public static boolean isPrime(int num)
    {
        for(int i=2; i < Math.sqrt(num) ;i++)
        {
            if(num%i==0)
                return false;
        }

        return true;
    }
}
