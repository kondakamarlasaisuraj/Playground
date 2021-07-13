#include<iostream>
using namespace std;
int count = 0;
struct Node{
 int data;
 struct Node* next;
}*first,*temp,*last;
void create(int input){
  struct Node* new_node = new Node();
  new_node -> data = input;
  if(first == NULL)
    first = new_node;
  else
    last -> next = new_node;
  last = new_node;
  count++;
}
void display(){
 temp = first;
  while(temp!=NULL){
   cout<<temp->data<<endl;
    temp = temp -> next;
  }
}
void insert(int pos,int val){
   struct Node* new_node = new Node();
   new_node -> data = val;
  temp = first;
  for(int i=0;i<pos-1;i++){
  temp = temp->next;
  }
  new_node -> next = temp->next;
  temp -> next = new_node;
  count++;
}
int main()
{
  first = NULL;
  int n;
  while(1){
    cin>>n;
    if(n<0)
      break;
    create(n);
  }
  cout<<"Before inserting the value:"<<endl;
  display();
  cout<<"Enter the position and value to be inserted:"<<endl;
  int pos,val;
  cin>>pos>>val;
  insert(pos,val);
  cout<<"After inserting the value:"<<endl;
  display();
  return 0;
}