#include<iostream>
using namespace std;
int sumOfArray(int a[100],int n){
  if(n<=0)
    return 0;
  return sumOfArray(a,n-1)+a[n-1];
}
int main()
{
  int a[100],n;
  cin>>n;
  for(int i=0;i<n;i++)
    cin>>a[i];
  cout<<sumOfArray(a,n);
}