#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,i,j,c=0,bc = 0;
  cin>>n;
  cin>>m;
  int arr[n];
  for(i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  
  for(i=0;i<n;i++)
  {
    if(arr[i] == m)
      c++;
    else{
     while(bc<m){
      bc = bc+arr[i];
       i++;
     }
     i--;
      if(bc>m){
      i--;
      }
     
     
      bc=0;
      c++;
    }
  }
  cout<<c;
  return 0;
}