package Arrays.Count_frequency_of_each_element_in_the_array;
import java.util.*;

public class Solution
{
    public static void main(String args[])
        {
            int arr[] = {3,2,7,87,8,4,9,12,3};
            countFrequency(arr);

        }

    public static void countFrequency(int[] nums)
    {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int num : nums)
        {
            if(map.containsKey(num))
            {
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }


        for(int num : map.keySet())
        {
            System.out.println(num + " " +  map.get(num));
        }
    }
}