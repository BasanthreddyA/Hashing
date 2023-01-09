
#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin>>n;
    vector<int> arr(n);
    cout<<"give the vector input"<<endl;
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    unordered_map<int,int>freq;
    for(int i=0;i<n;i++){
        freq[arr[i]]++;
    }
    for(int i=0;i<n;i++){
        int x;
        cin>>x;
        cout<<freq[x]<<endl;
    }
    

    return 0;
}
