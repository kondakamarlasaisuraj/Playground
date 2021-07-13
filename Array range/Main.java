#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  cout<<"Enter the number of elements in the array"<<endl;
  int n;
  cin>>n;
  int arr[n];
  cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<n;i++){
  cin>>arr[i];
  }
  int mini = arr[0];
  int maxi = arr[0];
  for(int i=0;i<n;i++){
    mini = min(mini,arr[i]);
    maxi = max(maxi,arr[i]);
  }
  cout<<"The range of the array is "<<maxi-mini;
}