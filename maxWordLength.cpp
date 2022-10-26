#include<bits/stdc++.h>
using namespace std;

// User defined function

int main()
{	
    int n;
    cin>>n;
    cin.ignore();
    char arr[n+1];
    cin.getline(arr,n);//it does not consider character after space as input for another variable space
    int i = 0;
    int currLength = 0,maxLength = 0;
    int maxSt = 0,st = 0;
    while(1)
    {
        if(arr[i]==' '||arr[i]== '\0'){
            if(currLength>maxLength){
                maxLength = currLength;
                maxSt = st;
            }
            st = i+1;
            currLength = 0;
        }
        else
            currLength++;
        
        if(arr[i]=='\0')
            break;
        i++;
    }
    cout<<maxLength<<endl;
    for(int i = 0;i<maxLength;i++){
        cout<<arr[i+maxSt];
    }
    cout<<"\n";
    return 0;
}