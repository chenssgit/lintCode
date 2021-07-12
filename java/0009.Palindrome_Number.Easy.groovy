/* Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
Example 1:
Input: 121
Output: true */

// 20210712 3mins
def solution(int a){ r=0;
  while(a>0){
    r=a%10+r*10;
    if(r==a) return true;
    a=a/10;
    if(r==a) return true;
    if(r>a) return false;
  }
  return false;
}

println(solution(123))
