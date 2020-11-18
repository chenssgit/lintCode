'''
Given two binary trees, write a function to check if they are the same or not.
Two binary trees are considered the same if they are structurally identical 
and the nodes have the same value.
Example 1:
Input:     1         1
          / \       / \
         2   3     2   3
        [1,2,3],   [1,2,3]
Output: true
Example 2:
Input:     1         1
          /           \
         2             2
        [1,2],     [1,null,2]
Output: false
Example 3:
Input:     1         1
          / \       / \
         2   1     1   2
        [1,2,1],   [1,1,2]
Output: false
20201119 10 mins
'''

A={'root':1, 'w':{'root':2},'e':{'root':3}}
B={'root':1, 'w':{'root':2},'e':{'root':3}}
def compare(a,b):
  if a==b==None: return True
  if a==None or b==None: return False
  if a.get('root','')!=b.get('root',''): return False
  if not compare(a.get('w',None),b.get('w',None)): return False
  if not compare(a.get('e',None),b.get('e',None)): return False
  return True
print(compare(A,B))
#print(A==B==None)
