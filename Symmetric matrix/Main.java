#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c;
  cin>>r>>c;
  int grid[r][c];
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      cin>>grid[i][j];
  
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      if(grid[i][j] == grid[j][i])
        continue;
      else{
      cout<<"Not Symmetric";
        return 0;
      }
    }
  }
    
  cout<<"Symmetric";
  return 0;
  
}