#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  int n,m;
  cin>>n>>m;
  int a = min(n,m);
  if(a%2 != 0)
    cout<<"Tyrion Lannister";
  else
    cout<<"Jaime Lannister";
}