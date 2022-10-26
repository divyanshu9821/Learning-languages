//given an array a[] of size n. Output sum of each subarray of the given array.

#include<bits/stdc++.h>
using namespace std;

// User defined function

int main()
{
    int n;cin>>n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    int sum = 0;
    for(int i = 0;i<n;i++)
    {
        for(int j = i;j<n;j++)
        {
            sum+=arr[j];
            cout<<sum<<endl; 
        }
    }
    

    return 0;
}