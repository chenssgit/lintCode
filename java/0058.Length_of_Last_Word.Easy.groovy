/*
Given a string s consists of upper/lower-case alphabets 
and empty space characters ' ', 
return the length of last word in the string.
If the last word does not exist, return 0.
Example
Given s = "Hello World", return 5.
* */

//20210808 5mins note: start from end
def solution(String s){ int i=0;
  for(char c in s.reverse()){
    if(c==' ') return i;
    i++;
  }; return i;
}
r=solution("hello world");
print r;
