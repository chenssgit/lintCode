'''Determine the number of bits required to convert integer A to integer B 
Example
Given n = 31, m = 14,return 2
(31)10=(11111)2
(14)10=(01110)2
Tags Expand 
Cracking The Coding Interview Bit Manipulation Binary Representation
Thinking process:
Assume the integer is 32 bit.
XOR a and b, shift by 1 bit everytime -> want to check the XORed value at index 0 : just & 1 will do.
Count the above calculated result: how many bit difference do a and b have.
20200617 3mins'''

n,m=31,14
t,r=n^m,0
while t>0:
  r+=t&1
  t=t>>1
print(r)
