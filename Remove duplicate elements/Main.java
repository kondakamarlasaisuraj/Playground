#include<iostream>
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
 
  map<int,int> m;
  for(int i=0;i<n;i++){
   if(m.find(arr[i]) == m.end()){
     cout<<arr[i]<<endl;
     m[arr[i]]++;
   }
     
     
  }
    
  
}