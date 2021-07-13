#include<iostream>
using namespace std;
int ct = 0;
struct node{
  int data;
  struct node* next = NULL;
}*first,*last,*temp;
void create(int n){
  struct node* new_node = new node();
  new_node -> data = n;
  if(first == NULL)
    first = new_node;
  else
    last -> next = new_node;
  last = new_node;
  ct++;
  
}
void display(){
temp = first;
while(temp != NULL){
cout<<temp->data<<endl;
  temp = temp -> next;
}
}
void deletion(){
  int i =0;
 for( i=0;i<ct;i++){
  //if(first == NULL)
    //    break;

    if(first->next == NULL)
    {
        delete first;
        first = NULL;
        break;
    }
   temp = first;
  while(temp->next->next != NULL){
   temp = temp -> next;
  }
  
   delete(temp->next);
   temp -> next = NULL;
   cout<<"After "<<i+1<<" deletion:"<<endl;
   display();
 }
  cout<<"After "<<i+1<<" deletion:"<<endl;
  cout<<"No value to delete";
}
int main()
{
  first = last = NULL;
  int n;
  while(1){
   cin>>n;
    if(n<1)
      break;
    create(n);
   }
  cout<<"Before deletion:"<<endl;
  display();
  deletion();
  return 0;
}