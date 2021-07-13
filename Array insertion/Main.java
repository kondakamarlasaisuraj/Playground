#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  int arr[100];
  cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<n;i++){
    cin>>arr[i];
  }
  cout<<"Enter the location where you wish to insert an element"<<endl;
  int loc;
  cin>>loc;
   if (loc>n){
    cout<<"Invalid Input";
  }
  else{
  cout<<"Enter the value to insert"<<endl;
  int val;
  cin>>val;
  int temp;
  for(int i=n;i>=loc;i--){
    arr[i] = arr[i-1];
   }
  arr[loc-1] = val;
  cout<<"Array after insertion is"<<endl;
  for(int i=0;i<=n;i++)
    cout<<arr[i]<<endl;
  }
}