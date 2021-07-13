#include<iostream>
using namespace std;
int main()
{
  int r,a[10][10];
  cin>>r;
  for(int i=0;i<r;i++)
    for(int j=0;j<r;j++)
      cin>>a[i][j];
  for(int i=0;i<r;i++){
    for(int j=0;j<r;j++)
      cout<<a[i][j]<<" ";
    cout<<endl;
  }
  
 
  
    
  
  cout<<"Transpose matrix is:"<<endl;
  
   for(int i=0;i<r;i++){
    for(int j=0;j<r;j++)
      cout<<a[j][i]<<" ";
    cout<<endl;
  }
  
  
}