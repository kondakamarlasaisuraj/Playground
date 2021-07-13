#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,suma=0,sumb=0;
  cin>>a>>b;
  int arr[a],brr[b];
  
  
    for(int i=0;i<a;i++){
      cin>>arr[i];
      suma+=arr[i];
    }
    for(int i=0;i<b;i++){
      cin>>brr[i];
      sumb+=brr[i];
    }
    
    if(suma == sumb && a == b)
      cout<<"Same";
   else
    cout<<"Not Same";
}