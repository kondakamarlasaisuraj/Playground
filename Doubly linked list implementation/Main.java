#include<iostream>
using namespace std;
struct node{
  int data;
  struct node* next = NULL;
  struct node* prev = NULL;
 }*first,*last,*temp;
void create(int n){
  struct node* newNode = new node();
  newNode->data = n;
  if(first == NULL){
    first = newNode;
   }
  else{
   last ->next = newNode;
    newNode -> prev = last;
  }
  last = newNode;
}
void display(){
 temp = first;
  while(temp){
    cout<<temp->data<<endl;
    temp = temp->next;
  }
}
int main()
{
  first = last = NULL;
  int n;
  while(1){
   cin>>n;
    if(n < 1)
      break;
    create(n);
  }
  display();
  return 0;
}