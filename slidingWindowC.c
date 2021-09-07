//implementation of sliding window using c
#include <stdio.h>
#include <stdlib.h>


int maxSubArray(int arr[],int n,int k);

int main()
{
    int arr[100];
    int n,k;
    printf("enter the size of the array\n ");
    scanf("%d",&n);
    for(int i=0;i<n;i++)
        scanf("%d",&arr[i]);
    printf("enter the size of the sub array\n");
    scanf("%d",&k);
    int result=maxSubArray(arr,n,k);
    printf("%d",result);
    return 0;
    
}

int maxSubArray(int arr[],int n,int k)
{
    int maxSum=0,currentWindowSum=0;
    
    for(int i=0;i<n;i++)
    {
        currentWindowSum+=arr[i];
        if(i>=k-1)
        {   
            if(!(maxSum>currentWindowSum))
            {
               maxSum=currentWindowSum;
            }
            // maxSum=max(maxSum,currentWindowSum);
            currentWindowSum-=arr[i-(k-1)];
        }
    }
    return maxSum;
}