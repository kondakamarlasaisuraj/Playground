#include <iostream>
using namespace std;
struct node{
  char data;
  struct node* next = NULL;
}*top = NULL,*temp;
void create(char input){
 struct node* new_node = new node();
  new_node->data = input;
  new_node -> next = top;
  top = new_node;
}
int balanced(string str){
  for(char i : str){
    if(i == '{' || i == '[' || i == '(')
      create(i);
    else{
     if(i == '}'){
        if(top->data != '{')
          return 0;
     }
      if(i == ']'){
        if(top->data != '[')
          return 0;
     }
      if(i == ')'){
        if(top->data != '(')
          return 0;
     }
      temp = top;
      top = top -> next;
      delete(temp);
      
    }
  }
}
int main() 
{
   string str;
   cin>>str;
  if(balanced(str))
     cout<<"Balanced";
  else
    cout<<"Not Balanced";
    return 0;
}