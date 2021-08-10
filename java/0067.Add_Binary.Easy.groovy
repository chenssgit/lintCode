/*
Given two binary strings, return their sum (also a binary string).
The input strings are both non-empty and contains only characters 1 or 0.
Example 1:
Input: a = "11", b = "1"
Output: "100"
Example 2:
Input: a = "1010", b = "1011"
Output: "10101"
*/

//20210811 20mins
def solution(String a,String b){ cc=0;c=[];
  if(a.size()>b.size()) {x=a.reverse(); y=b.reverse()}
  else {x=b.reverse(); y=a.reverse()}
  for(int i=0;i<x.size();i++){
    aa=x.charAt(i)-48
    bb=i>=y.size()?0:(y.charAt(i)-48)
    c.add(cc ^(aa ^ bb))
    cc=aa+bb+cc>1?1:0
  }; c.add(cc);
  return c.reverse();
}
r=solution("101","1101")
print r
