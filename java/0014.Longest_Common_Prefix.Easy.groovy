/* Leetcode
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
Example 1:
Input: ["flower","flow","flight"]
Output: "fl" */

// 20210714 10mins
def solution(){
  String[] strs = ["flower","fl","flight"];
  len = strs.size();
  int min=strs[0].size(); int mini=0;
  for(int i=1;i<len;i++) if(min>strs[i].size()) {min=strs[i].size();mini=i;}
  t=0;
  for(int t=0;t<min;t++){ int c = strs[0].charAt(t);
    for(int i=1;i<len;i++){
      if(strs[i][t]!=c) return strs[0].substring(0,t);
    }
  }
  return strs[mini];
}
println(solution());
