#include <iostream>

using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int songLength[n] = {0};
        for(int i = 0;i<n;i++){
            cin>>songLength[i];
        }

        int k;
        cin>>k;

        int johnLength = songLength[k-1];
        sort(songLength, songLength+n);
       
        for(int i = 0;i<n;i++){
            if(songLength[i]==johnLength){
                cout<<i+1<<endl;
                break;
            }
        }


    }
    return 0;
}