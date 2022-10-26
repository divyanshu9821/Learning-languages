#include <bits/stdc++.h>
using namespace std;

// User defined function

int main()
{
    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        //print space
        for (int j = 1; j <= n - i; j++)
            cout << ' ';
        //print numbers
        for (int j = i + 1; j <= i * 2 + 1; j++)
            cout << j;
        for (int j = i * 2; j >= i + 1; j--)
            cout << j;
        cout << endl;
    }
    return 0;
}