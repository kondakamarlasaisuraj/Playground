#include<bits/stdc++.h>
using namespace std;
struct node{
int data;
  struct node* next = NULL;
}*first,*last,*temp;
void create(int input){
  struct node* new_node = new node();
  new_node -> data = input;
  if(first == NULL)
    first = new_node;
  else
    last -> next = new_node;
  last = new_node;
}
void display(struct node* start = first ){
 temp = start;
  while(temp != NULL){
    cout<<temp->data<<endl;
    temp = temp->next;
  }
  
}
void remove_duplicates(){
  map<int,int> seen;
  struct node* curr = first;
  struct node* prev = NULL;
  while(curr != NULL){
    if(seen.find(curr->data) != seen.end()){
         prev->next = curr->next;
         delete(curr);
    }
    else{
     seen[curr->data]++;
      prev = curr;
    }
    //cout<<"prev display :"<<endl;
    //cout<<prev->data<<endl;
    curr = prev->next;
  }
  
  
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
  cout<<"Linked list before removal of duplicates"<<endl;
  display();
  cout<<"Linked list after removal of duplicates"<<endl;
  remove_duplicates();
  display();
  
  
  return 0;
}