class Node{int i; Node left,right;
  Node(int i,Node left,Node right){ this.i=i; this.left=left; this.right=right;}
  Node(int i,int j,int k){ this.i=i;this.left=new Node(j); this.right=new Node(k);}
  Node(int i){this.i=i;}
}

def solution(){
  t=new Node(1,new Node(2,3,4), new Node(2,4,3));
  if(eq(t.left,t.right)) println("sym"); else println("not sym");
}
solution();

def eq(Node t1, Node t2){
  if(!t1) return t2==null;
  if(!t2) return t1==null;
  if(t1.i!=t2.i) return false;
  return eq(t1.left,t2.right) && eq(t1.right,t2.left);
}
