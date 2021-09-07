//sliding window algorithm to find the largestSubArray with sum =8 using dynamic window technique
public class Main
{
    
    public static int maxSubArray(int arr[],int sum)
    {
    int windowSize=0;
    int windowRight=0,windowLeft=0;
    int sumInWindow=0;
    int currentWindowSum=0;
    int maxLength=0;
    for(windowRight=0;windowRight<arr.length;windowRight++)
    {
        currentWindowSum+=arr[windowRight];
        while(currentWindowSum>=sum)
        {
            maxLength=Math.max(maxLength,windowRight-windowLeft+1);
            currentWindowSum-=arr[windowLeft];
            windowLeft++;
            
        }
    }
    return maxLength;
    }
	public static void main(String[] args) {
		int[] array =new int[]{4,2,2,7,8,1,2,8,10,2,2,2,2};
		int sum=8;
		System.out.println(maxSubArray(array,sum));
	}
}
