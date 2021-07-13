#include<iostream>
using namespace std;
struct node{
  int data;
  struct node* next = NULL;
}*first,*last,*temp;
void display(){
 temp = first;
  while(temp!=NULL){
    cout<<temp->data<<endl;
    temp = temp->next;
  }
}
void create(int input){
 struct node* new_node = new node();
  new_node -> data = input;
  if(first == NULL)
    first = new_node;
  else{
      last -> next = new_node;
   }
  last = new_node;
  //count++;
}
void delete_(){
 
  int i=1;
  while(first != NULL){
    temp = first;
    first = first->next;
    delete(temp);
    
    cout<<"After "<<i<<" deletion:"<<endl;
    display();
    i++;
  }
  //cout<<"After "<<i<<" deletion"<<endl;
  cout<<"No value to delete"<<endl;
}
int main()
{
  first = last = NULL;
  int n;
  while(1){
  cin>>n;
    if(n<0){
    break;
    }
    create(n);
  }
  cout<<"Before deletion:"<<endl;
  display();
  delete_();
  return 0;
}