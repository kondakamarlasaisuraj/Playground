#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int nm,vc;
  cin>>nm>>vc;
  int m[nm];
  int sum = 0;
  for(int i=0;i<nm;i++){
  cin>>m[i];
    sum+=m[i];
  }
  if(sum<=vc)
    cout<<"YES";
  else
    cout<<"NO";
}