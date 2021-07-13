#include<iostream>
using namespace std;
struct node{
  int data;
  struct node* next = NULL;
  struct node* prev = NULL;
}*first,*last,*temp;
void create(int input){
  struct node* newNode = new node();
  newNode->data = input;
  if(first == NULL){
   first = newNode;
  }else{
   last -> next = newNode;
    newNode -> prev = last;
  }
  last = newNode;
}
void display(struct node* start =first){
 temp = start;
  while(temp){
   cout<<temp->data<<endl;
    temp = temp -> next;
  }
}
struct node* reverse(){
 struct node *curr = first;
  struct node* prev = NULL;
  while(curr){
     struct node* nextNode = curr->next;
     curr->next = prev;
     //curr->next->prev = curr;
     prev = curr;
     curr = nextNode;
  }
  return prev;
}
int main()
{
  int n;
  first = last = NULL;
  while(1){
   cin>>n;
    if(n<1)
      break;
    create(n);
  }
  cout<<"Original order:"<<endl;
  display();
  cout<<"Reverse order:"<<endl;
  struct node* prev = reverse();
  display(prev);
  return 0;
}