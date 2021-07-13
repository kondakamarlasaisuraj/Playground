#include<iostream>
using namespace std;
struct node{
 int data;
  struct node* next = NULL;
}*first,*temp,*last;
void create(int input){
  struct node* new_node = new node();
  new_node -> data  = input;
  if(first == NULL)
    first = new_node;
  else
    last -> next = new_node;
  last = new_node;
}
void display(struct node* start = first){
  temp = start;
  while(temp!=NULL){
    cout<<temp->data<<endl;
    temp = temp->next;
  }
    
}
void reverse(){
  struct node* prev = new node();
  struct node* after = new node();
  prev = NULL;
  while(first){
    after = first -> next;
    first -> next = prev;
    prev = first;
    first = after;
    
  }
  display(prev);
  
}
int main()
{
  first = NULL;
  int n;
  while(1){
    cin>>n;
    if(n<1)
      break;
    create(n);
  }
  cout<<"Before Reversing the list:"<<endl;
  display();
  cout<<"After Reversing the list:"<<endl;
  reverse();
  
  
  return 0;
}