'''E
tags: Array, Hash Table
time: O(n)
space: O(n)

#### HashMap<value, index>
- 相对暴力简洁: 找到一个value, 存一个index
- 若在HashMap里面 match 到结果, 就return HashMap里存的index. 
- O(n) space && time.

#### Sort array, two pointer
- 前后++, --搜索. Sort 用时O(nlogn).     
- 1. 第一步 two pointer 找 value.       
- 2. 注意，要利用额外的空间保留original array， 用来时候找index. (此处不能用HashMap，因为以value 为key，但value可能重复)      
- O(n) space, O(nlogn) time.    


```
/**
LeetCode: 0-based answer
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/
/*
Thoughts:
    Using a HashMap, O(n) space and O(n) time.
    Thinking process:
    Push everything into a HashMap.
    Check if one element exist in the HashMap, if so save it. Meanwhile, save the other one.
    Trick: after adding into the HashMap, we are looking for the 2nd index first. 
        Always check (target - current) from the HashMap. 
        If exist, that means index0 has already been pushed into the HashMap and current value is at index1.
    (key, value) = (numbers[i], i)
    Note: return index+1 because this is not 0-based.
*/
20200616 5mins'''

nums, target = [2, 7, 11, 15], 18
d={}
for i,v in enumerate(nums):
  if target-v in d: print( d[target-v]+1, i+1)
  d[v]=i
