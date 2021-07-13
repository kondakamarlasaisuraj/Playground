#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c;
  cin>>r>>c;
  int grid[r][c];
  for(int i=0;i<r;i++){
  for(int j=0;j<c;j++){
     cin>>grid[i][j];
  }
 }
  int sum =0;
  for(int i=0;i<c;i++){
      sum += grid[0][i];
    
   }
  for(int i=0;i<c;i++){
      sum += grid[r-1][i];
    
   }
  
  for(int i=1,j=c-2;i<r-1;i++,c--)
    sum += grid[i][j];
  cout<<"Sum of Zig-Zag pattern is "<<sum;
  
}