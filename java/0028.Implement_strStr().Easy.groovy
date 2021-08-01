/* 给两个string A, B, 找一个 B 在 A 种的起始位置.
Implement strStr().
Returns the index of the first occurrence of needle in haystack, 
or -1 if needle is not part of haystack. */

//20210801 10mins
def solution(String str,String a){
  int j=0;
  int stri=str.size(), ai=a.size();
  for(int i=0;i<stri;i++){
    for(j=0;j<ai;j++){
      if(i>=stri) return j==ai?i:-1;
      if(str[i+j]!=a[j]) break;
    }
    if(j==ai) return i;
  }; return -1;
}
i=solution("abcdef", "cd");
print i;
