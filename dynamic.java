//sliding window algorithm to find the smallestSubArray with sum =8 using dynamic window technique


public class Main
{
    
    public static int smallestSubArray(int arr[],int sum)
    {
            int windowSize=Integer.MAX_VALUE;
            int currentWindowSum=0;
            int windowLeft=0,windowRight=0;
            for(windowRight=0;windowRight<arr.length;windowRight++)
            {
                currentWindowSum+=arr[windowRight];
                while(currentWindowSum>=sum)
                {
                    windowSize=Math.min(windowSize,windowRight - windowLeft + 1);
                    currentWindowSum-=arr[windowLeft];
                    windowLeft++;
                }
            }
            return windowSize;
    }
    
	public static void main(String[] args) {
		int[] array =new int[]{4,2,2,7,8,1,2,8,10};
		int sum=8;
		System.out.println(smallestSubArray(array,sum));
	}
}
