#include<iostream>
using namespace std;
int dig(int n){
 if(n<=9)
   return 1;
 return dig(n/10)+1;
}
int main()
{
  int n;
  cout<<"Enter the value of n"<<endl;
  cin>>n;
  cout<<"The number of digits in "<<n<<" is "<<dig(n);
}