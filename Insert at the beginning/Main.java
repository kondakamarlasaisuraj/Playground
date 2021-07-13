#include<iostream>
using namespace std;
struct node
{
    int data ;
    struct node *link = NULL ;
}*first, *last , *temp ;
void create(int input){
  struct node *new_node = new struct node;
  new_node -> data = input;
  if(first == NULL)
    first = new_node;
  else{
    new_node -> link = first;
  }
  
  first = new_node;
}
void display()
{
    temp = first ;
    
    while(temp != NULL)
    {
        cout << temp -> data<<endl  ;
        temp = temp -> link ;                       
    }
    //cout << "NULL" ;
}
int main()
{
  first=last=NULL;
  int input;
  while(1){
  cin>>input;
    if(input<0)
      break;
    create(input);
  }
  
  display();
  
  return 0;
}