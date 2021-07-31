/*Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
Example
Given 1->3->8->11->15->null, 2->null , return 1->2->3->8->11->15->null
*/

//20210731 10mins
class Node{
  int i; Node next; 
  public Node(int val){this.i=val;}
}
def solution(Node list1, Node list2){
  Node ret=new Node(0); Node c=ret;
  while(list1&&list2){
    if(list1.i>list2.i){
      c.next=list2;list2=list2.next;
    }else{
      c.next=list1;list1=list1.next;
    }; c=c.next;
  }
  if(list1) c.next=list1;
  if(list2) c.next=list2;
  return ret.next; //smart
}
Node list1=new Node(1), list2=new Node(2); Node c=list1;
for(i in [3,5,7]){ c.next=new Node(i); c=c.next;}
ret=solution(list1,list2);
while(ret){print ' '+ret.i; ret=ret.next;}
