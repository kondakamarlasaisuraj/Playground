//#include<iostream>
#include<unordered_set>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++){
  cin>>arr[i];
  }
  unordered_set<int> s(arr,arr+n);
  int ans = s.size();
  cout<<"There are "<<ans<<" distinct element in the array.";
}