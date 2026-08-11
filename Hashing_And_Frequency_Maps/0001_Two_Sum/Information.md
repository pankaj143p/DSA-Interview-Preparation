# Two Sum

**LeetCode:** [Problem #1](https://leetcode.com/problems/two-sum/)

**Difficulty:** Easy

**Pattern:** HashMap

## Approach

Use a HashMap to store the numbers we have already seen.

For every element:
1. Calculate `target - nums[i]`.
2. Check if the complement exists in the HashMap.
3. If it exists, return both indices.
4. Otherwise, store the current number and its index.

## Complexity

- Time: O(n)
- Space: O(n)

## Key Takeaway

Use a HashMap when you need fast lookup while iterating through an array.

## Solution

See [`Solution.java`](Solution.java).