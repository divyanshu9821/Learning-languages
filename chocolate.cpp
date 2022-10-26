//how many chocolate does a person can buy. 1 choclocate = 1 rs, and shopkeeper is ready
//to give one chocolate in excange of three chocolate wrappers.
#include<bits/stdc++.h>
using namespace std;

// User defined function

int main()
{
    int money = 0, noOfChocolates = 0;
    cin>>money;
    int wrapper = 0;
    while(money>0)
    {
        noOfChocolates = noOfChocolates + money;
        wrapper = money+wrapper%3 ;
        money = wrapper/3;
    }
    cout<<noOfChocolates<<endl;
    return 0;
}