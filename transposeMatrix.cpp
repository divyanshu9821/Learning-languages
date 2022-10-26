#include <bits/stdc++.h>
using namespace std;

// User defined function

int main()
{
    int m, n;
    cin >> m >> n;
    int arr[m][n];
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cin >> arr[i][j];
        }
    }

    for(int  i =0 ;i <m;i++){
        for(int j =i;j<n;j++){
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
        }
    }

    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cout<< arr[i][j]<<" ";
        }
        cout<<"\n";
    }
    return 0;
}