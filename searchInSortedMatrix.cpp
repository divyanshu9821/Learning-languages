#include <bits/stdc++.h>
using namespace std;

// User defined function

int main()
{
    int m, n, k;
    cin >> m, n, k;
    int matrix[m][n];
    //matrix should be sorted means row and column both are sorted.
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cin >> matrix[i][j];
        }
    }
    int row = 0, col = n-1;
    bool found = false;
    while (row<n && col>=0){
        if(matrix[row][col]==k)
            found = true;
        else if(matrix[row][col]<k)
            row++;
        else
            col--;
                    
    }
    if(found)
        cout<<"Element found";
        else
            cout<<"Element not found";
        return 0;
}