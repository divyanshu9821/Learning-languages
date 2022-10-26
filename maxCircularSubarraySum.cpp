#include<bits/stdc++.h>
using namespace std;
int kadane(int arr[],int n){
    int currSum = 0;
    int maxSum;
    for(int i = 0 ;i<n;i++){
        currSum +=arr[i];
        if(currSum <0)
            currSum = 0;
        maxSum = max(maxSum,currSum);
    }
    return maxSum;
}
// User defined function

int main()
{	
    int n;
    cin>>n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }

    int nowWrapSum = kadane(arr,n);
    
    int totalSum = 0;
    for(int i = 0;i<n;i++)
    {
        totalSum+=arr[i];
        arr[i]=0-arr[i];
    }
    
    int wrapSum = totalSum+kadane(arr,n);
    cout<<max(wrapSum,nowWrapSum)<<endl;
    
    return 0;
}