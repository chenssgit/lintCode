/*
Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it.
Example:
Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
*/
//20211208 10mins

def solution(int n){
  if(n<=0) return []
  ret=[[1]]
  if(n==1) return ret
  row1=[1,1]
  if(n==2) return ret
  ret.add(row1)
  for(int i=1;i<n-1;i++){ row2=[1]
    for(j=0;j<i;j++) row2.add(row1[j]+row1[j+1])
    row2.add(1)
    row1=row2.clone()
    ret.add(row1)
  }
  return ret
}
print(solution(5))
