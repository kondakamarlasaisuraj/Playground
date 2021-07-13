#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  cout<<"Enter the number of elements in the array"<<endl;
  int n;
  cin>>n;
  cout<<"Enter the elements in the array"<<endl;
  int arr[n];
  for(int i=0;i<n;i++)
    cin>>arr[i];
  bool odd = false;
  bool even = false;
 // bool mixed = false;
  for(int i=0;i<n;i++){
    if(arr[i]%2 == 0)
      even = true;
    else if(arr[i]%2 != 0)
      odd = true;
  }
  if(even && odd)
    cout<<"The array is Mixed";
  else if(odd)
    cout<<"The array is Odd";
  else
    cout<<"The array is Even";
}