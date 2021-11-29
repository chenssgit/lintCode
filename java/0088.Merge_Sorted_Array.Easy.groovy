/*
Given two sorted integer arrays nums1 and nums2, 
merge nums2 into nums1 as one sorted array.
Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) 
to hold additional elements from nums2. 
The number of elements initialized in nums1 and nums2 are m and n respectively.
Example:
Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3
Output: [1,2,2,3,5,6]
Hide Company Tags Bloomberg Facebook
Hide Tags Array Two Pointers
Hide Similar Problems (E) Merge Two Sorted Lists
*/


/*
Thinking process:
1. start from the end, track back. End index = m + n;
2. when ever check a position, need to do index-1, because index=m+n is the size of array.
3. Make sure to clean up the second array B.
*/

//20211129
def solution(int[] a, int m, int[] b, int n){
  s=m+n-1;m--;n--;
  while(m>=0&&n>=0)
    if(a[m]>b[n]){
      a[s--]=a[m--];
    }else{
      a[s--]=b[n--];
    }
//   while(m>=0&&n>=0) a[s--]=a[m]>b[n]?a[m--]:b[n--];
  while(m>=0) a[s--]=a[m--];
  while(n>=0) a[s--]=b[n--];
  return a;
}

int[] aa=[1,2,3,0,0,0]
int[] bb=[2,5,6]
print(solution(aa,3,bb,3))
