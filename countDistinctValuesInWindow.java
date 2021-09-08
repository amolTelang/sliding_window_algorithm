/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.HashMap;
import java.util.Map;
public class Main
{   
    static void countDistinctValuesInWindow(int arr[],int k)
    {   //local variables
        int count=0;
        int windowLeft=0;
        int windowRight=0;
        //create a hash map to store different values
        Map<Integer, Integer> mp = new HashMap<>();
        for(windowRight=0;windowRight<arr.length;windowRight++)
        {   //add elements to the hash map
            if(mp.containsKey(arr[windowRight]))
                {
                     mp.put(arr[windowRight],mp.get(arr[windowRight])+1);
                }
                else{
                    mp.put(arr[windowRight],1);
                    count++;
                }
                if(windowRight>=k-1)
                {
                     System.out.println("The count of distinct elements in subarray [" +
                        (windowRight - k + 1) + ", " + windowRight + "]" + " is " + count);
                }
            //ignore first 5 elements
            if(windowRight>=k)
            {   
                mp.put(arr[windowRight-k],mp.getOrDefault(arr[windowRight-k],0)-1);
                if(mp.get(arr[windowRight-k])==0)
                    {
                        count--;
                    }
                
            }
        }
    }
	public static void main(String[] args) {
	 int[] array =new int[]{  2, 1, 2, 3, 2, 1, 4, 5};
	 int k=5;
countDistinctValuesInWindow(array,k);
	}
}
