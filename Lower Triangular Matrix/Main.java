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
    for(int j=i+1;j<r;j++){
     if (a[i][j]==0){
       continue;
     }
      else{
        cout<<"Not a Lower Triangular Matrix";
        return 0;
      }
    }
}   
  cout<<"Lower Triangular Matrix";
  return 0;  

}