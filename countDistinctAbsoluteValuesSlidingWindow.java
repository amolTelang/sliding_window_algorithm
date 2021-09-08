//java program to Count distinct absolute values in a sorted array using sliding window problem
import java.util.*;

public class Main
{
    
   static int countDistinctAbsoluteValuesSlidingWindow(int arr[])
    {   int windowLeft=0;
        int windowRight=arr.length-1;
        int count=arr.length;
        while(windowRight>windowLeft)
        {
           
            //removing duplicate elements from the right side
            while(windowRight>windowLeft&&arr[windowRight]==arr[windowRight-1])
            {
                count--;
                windowRight--;
            }
            while(windowLeft<windowRight&&arr[windowLeft]==arr[windowLeft+1])
            {
                count--;
                windowLeft++;
            }
             //if only one element is left
            if(windowLeft==windowRight)
                break;
            //adding elements on the either side of window
            int sum=arr[windowLeft]+arr[windowRight];
            //if sum is 0 it means both have same absolute values
            if(sum==0)
            {
                count--;
                windowLeft++;
                windowRight--;
            }
            //if sum is positive that means value on the right side is greater
            else if(sum<0)
            {
                windowLeft++;
            }
            //sum is negative that means value on the left side is greater
            else
            {
                windowRight--;
            }
        }
        return count;
    }
	public static void main(String[] args) {
     int[] array =new int[]{ -2, -1, 0, 1, 2, 3};
	System.out.println(countDistinctAbsoluteValuesSlidingWindow(array));
	}
}