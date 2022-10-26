#include<bits/stdc++.h>
using namespace std;

// User defined function

int main()
{
    int n;
    cin>>n;
    int arr[n];
    for(int i = 0;i<n;i++){
        cin>>arr[i];
    }

    int maxElement = arr[0];
    for(int i = 0;i<n;i++){
        if(arr[i]>maxElement)
            maxElement = arr[i];
        //maxElement = max(maxElement,arr[i]);    
    }
    cout<<"MaxInArray: "<<maxElement<<endl;

    return 0;
}