# Contains Duplicate

**LeetCode:** [Problem #217](https://leetcode.com/problems/contains-duplicate/)

**Difficulty:** Easy

**Pattern:** HashSet / Hashing

## Approach

Use a HashSet to keep track of the elements that have already been seen.

While traversing the array:

1. Check if the current element already exists in the HashSet.
2. If it exists, a duplicate is found, so return `true`.
3. Otherwise, add the element to the HashSet.
4. If the complete array is traversed without finding a duplicate, return `false`.

## Complexity

- Time: O(n)
- Space: O(n)

## Key Takeaway

Use a HashSet when you need to efficiently check whether an element
has already appeared.

## Solution

See [`Solution.java`](Solution.java).