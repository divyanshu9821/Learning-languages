#include<bits/stdc++.h>
using namespace std;

// User defined function

int main()
{	
    //matrix input
    int n,m;
    cin>>m>>n;
    int arr[m][n];
    for(int i = 0;i<m;i++){
        for (int j = 0; j < n; j++){
            cin>>arr[i][j];   
        }        
    }

    //spiralMatrixTraversal
    int rowStart = 0,columnStart = 0,rowEnd = m-1,columnEnd = n-1;
    while(rowStart<=rowEnd&&columnStart<=columnEnd){
        //for rowStart
        for (int col = columnStart; col <= columnEnd; col++)
            cout<<arr[rowStart][col]<<" ";

        rowStart++;

        //for columnEnd
        for (int row = rowStart; row < rowEnd; row++)
            cout<<arr[row][columnEnd]<<" ";
        
        columnEnd--;

        //for rowEnd
        for (int col = columnEnd; col >= columnStart; col--)
            cout<<arr[rowEnd][col]<<" ";

        rowEnd--;

        //for columnStart
        for (int row = rowEnd; row >= rowStart; row--)
            cout<<arr[row][columnStart]<<" ";

        columnStart++;
        
    }
    return 0;
}