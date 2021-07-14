/* Leetcode
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
Example 1:
Input: ["flower","flow","flight"]
Output: "fl" */

// 20210714 10mins
def solution(){
  String[] strs = ["flower","flow","flight"];
  len = strs.size();
  t=0;
  while(true){ int c = strs[0].charAt(t);
    for(int i=1;i<len;i++){
      if(strs[i][t]!=c) return strs[0].substring(0,t);
    }
    t++;
  }
}
println(solution());
