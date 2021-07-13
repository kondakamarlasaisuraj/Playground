#include<iostream>
using namespace std;
struct Node
{
  int data;
  Node *next = NULL;
};
struct Node *head;

void insert (int data)
{
  Node *new_node = new Node();
  new_node -> data = data;
  if(head == NULL)
    head = new_node;
  else
  {
    new_node -> next = head;
    head = new_node;
  }
}
void answer ()
{
  Node *temp1= head;
  while(temp1 !=NULL)
  {
    cout << char(temp1 -> data);
    temp1 = temp1 -> next;
  }
  cout << endl;
}

int main()
{
  head = NULL;
  string item;
  getline(cin,item);
  for(char i:item)
    insert(char(i));
  answer();
  
  
  return 0;
}