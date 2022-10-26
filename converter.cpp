/*
convertor:
binary to decimal
octal to decimal
hexadecimal to decimal
decimal to binary
decimal to octal
decimal to hexadecimal
*/
#include <bits/stdc++.h>
using namespace std;

int binaryToDecimal(int n)
{
    int base = 1, ans = 0;
    while (n > 0)
    {
        ans += n % 10 * base;
        n /= 10;
        base *= 2;
    }
    return ans;
}

int octalToDecimal(int n)
{
    int base = 1, ans = 0;
    while (n > 0)
    {
        ans += n % 10 * base;
        n /= 10;
        base *= 8;
    }
    return ans;
}

int hexadecimalToDecimal(string n)
{
    int base = 1;
    int ans = 0;
    int strlen = n.size();
    for (int i = strlen - 1; i >= 0; i--)
    {
        if (n[i] >= '0' && n[i] <= '9')
            ans += (n[i] - '0') * base;
        else if (n[i] >= 'A' && n[i] <= 'F')
            ans += (n[i] - 'A' + 10) * base;
        base *= 16;
    }
    return ans;
}

int decimalToBinary(int n)
{
    int base = 1;
    int ans = 0;
    while (base <= n)
        base *= 2;
    base /= 2;
    while (base > 0)
    {
        int lastDigit = n / base;
        n -= lastDigit * base;
        ans = ans * 10 + lastDigit;
        base /= 2;
    }
    return ans;
}

int decimalToOctal(int n)
{
    int base = 1;
    int ans = 0;
    while (base <= n)
        base *= 8;
    base /= 8;
    while (base > 0)
    {
        int lastDigit = n / base;
        n -= lastDigit * base;
        ans = ans * 10 + lastDigit;
        base /= 8;
    }
    return ans;
}

string decimalToHexadecimal(int n)
{
    int base = 1;
    string ans = "";
    while(base<=n)
        base*=16;
    base/=16;    
    while(base>0)
    {
        int lastdigit = n/base;
        n-=lastdigit*base;
        base /=16;
        if(lastdigit<=9)
            ans = ans + to_string(lastdigit);
        else{
            char c = 'A' + lastdigit-10;
            ans.push_back(c);
        }    
    }
    return ans;
}

int main()
{
    string n;
    int n1;
    cin >> n1;
    cout << decimalToHexadecimal(n1) << endl;
    //change the function in output statement to use that particular convertor function.
    return 0;
}