#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++){
  cin>>arr[i];
  }
  cout<<"Sorted array is:"<<endl;
  for(int i=0;i<n;i++){
    int min = i;
    int temp = arr[i];
     for(int j=i;j<n;j++){
       if(arr[j]<arr[min])
         min = j;
  }
    arr[i] = arr[min];
    arr[min] = temp;
    cout<<arr[i]<<endl;
  
}}