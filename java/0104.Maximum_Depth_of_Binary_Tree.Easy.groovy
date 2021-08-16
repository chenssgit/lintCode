/*
Given a binary tree, find its maximum depth.
The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
Note: A leaf is a node with no children.
Example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its depth = 3.
*/

/*
Thinking process:
check if root is null, return 0 if so.
Divide and return integer as the depth
Conquer: find the max and return depth + 1.
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
 //20210816 10mins
class Tree{
  Tree left,right; int i;
  Tree(ii,left,right){this.left=left; this.right=right; this.i=ii;}
  Tree(ii){this.i=ii}
}
def treeDepth(Tree t){
  if(t==null) return 0;
  return Math.max(treeDepth(t.left), treeDepth(t.right))+1;
}
t=new Tree(3, new Tree(9,null,null), new Tree(20,new Tree(15), new Tree(7)));
print treeDepth(t);
