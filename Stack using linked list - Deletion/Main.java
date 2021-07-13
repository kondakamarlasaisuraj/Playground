#include<bits/stdc++.h>
using namespace std;
struct node{
int data;
struct node* link;
}*first,*last,*temp;
void create(int input)
{
    struct node *new_node = new struct node ;   
    
    new_node -> data = input ;
    
    new_node -> link = first ;
    
    first = new_node ;
}

void display()
{
    temp = first ;
    
    while(temp != NULL)
    {
        cout << temp -> data << ' ';
        temp = temp -> link ;                       
    }
  cout<<endl;
}
 void deletion(){
  while(first != NULL){
  temp = first;
    first = first->link;
    cout<<"Deleted element is "<<temp->data<<endl;
    delete(temp);
  }
  cout<<"Stack is empty";
}
int main()
{
  int input;
  first=last=NULL;
  while(1){
   cin>>input;
    if(input<0)
      break;
    create(input);
  }
  cout<<"Before deleting:"<<endl;
  display();
  deletion();
  return 0;
}