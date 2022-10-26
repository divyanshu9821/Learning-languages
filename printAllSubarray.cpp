//we given an array we need to print all the possible subarray
#include <bits/stdc++.h>
using namespace std;

// User defined function

int main()
{
    int noOfElements;
    cin >> noOfElements;
    int arr[noOfElements];
    for (int i = 0; i < noOfElements; i++)
        cin >> arr[i];

    for (int i = 0; i < noOfElements; i++)
    {
        for (int j = i;j<noOfElements;j++)
        {
            for(int k = i;k<=j;k++)
                cout<<arr[k]<<" ";
            cout<<endl;        
        }

    }    

            return 0;
    }