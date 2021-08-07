/**
LeetCode:
Given an integer array nums, find the contiguous subarray (containing at least one number) 
which has the largest sum and return its sum.
Example:
Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:
If you have figured out the O(n) solution, 
try coding another solution using the divide and conquer approach, 
which is more subtle.
 */
 
//20210808 60mins
def solution(int[] data){ max=Integer.MIN_VALUE;
  for(int i=0;i<data.length;i++){ s=data[i];
    for(int j=i+1;j<data.length;j++){
      s+=data[j];
      if(s>max){ max=s; m=i;n=j; }
    }
  }; return [max,m,n];
}
data=[-2,1,-3,4,-1,2,1,-5,4] as int[]
r=solution(data)
print r
