//sliding window problem solution to find the max sum of subarray window size=3
public class Main
{
    
    public static int maxSubArraySum(int arr[],int k)
    {
        int i=0;
        int maxValue=0;
        int maxInWindow=0;
        for(i=0;i<arr.length;i++)
        {
            maxInWindow+=arr[i];
            if(i>=(k-1))
            {
                maxValue=Math.max(maxValue,maxInWindow);
                maxInWindow-=arr[i-(k-1)];
            }
        }
        return maxValue;
    }
    
    
	public static void main(String[] args) {
    int[] array=new int[]{1,2,3,4,5,6,7,8,-9,10};
    int k=3;
    int res=maxSubArraySum(array,k);
    System.out.println(res);
    
	}
}
