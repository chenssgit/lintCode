/* E
tags: Math, String
time: O(n)
space: O(1)

#### String 
- 熟悉罗马字母规则     
- 1. 'I V X L C D M' 分别代表的数字     
- 2. 列举combo的情况，需要从原sum里面减掉多加的部分: 'IV, IX'减2, 'XL, XC'减20, 'CD, CM'减200. 
- Leading `I(1*2)`, `X(10*2)`, `C(100*2)` causes double counting 

https://en.wikipedia.org/wiki/Roman_numerals

#### use map to store combinations

Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.

Hide Company Tags Bloomberg Uber
Hide Tags Math String
Hide Similar Problems (M) Integer to Roman
*/

/*
Thoughts:
Know the rules of roman number:
I: 1
V: 5
X: 10
L: 50
C: 100
D: 500
M: 1000

There are usual combinations:
IV: 4
IX: 9
XL: 40
XC: 90
CD: 400
CM: 900
When the combo occurs, for instance:
I V -> 1 + 5 = 6
IV  -> 4
=> extra '2'
If we sum each individual digits, then we need to extract the extra '2'

Similar for other examples:
C D -> 100 + 500 = 600
DC  -> 400
=> extra '200'
*/
// 2010622 10 mins
roma=[ I:1, V:5, X:10, L:50, C:100, D:500, M:1000]
def solution(String str){
  r=nn=0
  n= roma[""+str.charAt(0)]
  for(int i=0; i<str.length()-1; i++){
    nn = roma[""+str.charAt(i+1)]
    r+=(nn>n)?-n:n;
    n=nn;
  }
  println(r+nn);
}
solution("VX")
solution("IX")
solution("XII")
solution("VIX")
solution("XIX")
print("abc".split("")[1])
