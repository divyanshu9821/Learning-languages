/*
check if there exit two elements in an array such that their sum is equal to k
*/
#include <bits/stdc++.h>
using namespace std;
//complexity is n^2
bool brootForce(int arr[], int n, int k)
{
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (arr[i] + arr[j] == k)
                return true;
        }
    }
    return false;
}
//time complexity is n
int check(int arr[],int n,int k){
    int low = 0;
    int high = n-1;
    while(high>low){
        if(arr[low]+arr[high]==k){
            return true;
        }
        else if(arr[low]+arr[high]>k){
            high--;
        }
        else
            low++;
    }
    return false;
}
int main()
{
    int n; cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
        cin >> arr[i];
    int k; cin >> k;
    sort(arr,arr+n);
    cout <<check(arr,n,k)<<endl;
    // cout << brootForce(arr, n, k) << endl;
    return 0;
}