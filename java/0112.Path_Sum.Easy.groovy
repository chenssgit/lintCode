/*
Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
Note: A leaf is a node with no children.
Example:
Given the below binary tree and sum = 22,
      5
     / \
    4   8
   /   / \
  11  13  4
 /  \      \
7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.

Thoughts:
DFS on the function itself, keep subtracting the root.val.
when root == null && sum == 0, return true;
*/

//Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
    TreeNode(int x,TreeNode le, TreeNode ri){ val=x; left=le; right=ri; }
}

//20211207
def solution(TreeNode tree, int num){
  if (num==0) return true;
  if (tree==null) return false;
  if (solution(tree.left,num-tree.val)) return true;
  if (solution(tree.right,num-tree.val)) return true;
  return false;
}

le = new TreeNode(4,new TreeNode(11,new TreeNode(7), new TreeNode(2)), null)
ri = new TreeNode(8,new TreeNode(13), new TreeNode(4,null,new TreeNode(1)))
tree = new TreeNode(5,le,ri)
println(solution(tree, 22))
