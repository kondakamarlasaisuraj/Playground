#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int arr[n],brr[n];
  for(int i=0;i<n;i++){
  cin>>arr[i];
  }
  for(int i=0;i<n;i++){
  cin>>brr[i];
  }
  int res;
  sort(arr,arr+n);
  sort(brr,brr+n);
  for(int i=0;i<n;i++){
    res += (arr[i]*brr[i]);
  }
  cout<<res;
}