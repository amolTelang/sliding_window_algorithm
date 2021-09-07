//implementation of sliding window with dynamic window size to find the length of the minimum subarray with given sum
#include <stdio.h>
#include <stdlib.h>


int minArrayLength(int arr[],int n,int k);

int main()
{
    int arr[100];
    int n,sum;
    printf("enter the size of the array\n ");
    scanf("%d",&n);
    for(int i=0;i<n;i++)
        scanf("%d",&arr[i]);
    printf("enter the max sum of the sub array\n");
    scanf("%d",&sum);
    int result=minArrayLength(arr,n,sum);
    printf("%d",result);
    return 0;
    
}

int minArrayLength(int arr[],int n,int sum)
{
    int minLength=100000,currentWindowSum=0;
    int windowRight=0,windowLeft=0;
    for(windowRight=0;windowRight<n;windowRight++)
    {
        currentWindowSum+=arr[windowRight];
        while(currentWindowSum>=sum)
        {
            if(!(minLength<(windowRight-windowLeft+1)))
            {
                minLength=windowRight-windowLeft+1;
            }
            currentWindowSum-=arr[windowLeft];
            windowLeft++;
        }
    }
    
  
    return minLength;
}