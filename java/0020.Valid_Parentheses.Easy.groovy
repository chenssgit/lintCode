/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
Example
The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*/

// 20210719
paras=['(':')', '{':'}', '[':']']
def solution(String s){
  len=s.size()
  m = len/2
  for(i=0;i<m;i++){
    if(paras[s[i]]!=s[len-1-i]) return false;
  }
  return true;
}
println(solution("[({})]"))
