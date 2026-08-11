# Maximum Subarray

**LeetCode:** [Problem #53](https://leetcode.com/problems/maximum-subarray/)

**Difficulty:** Medium

**Pattern:** Kadane's Algorithm / Dynamic Programming

## Approach

Use Kadane's Algorithm to find the maximum sum of a contiguous
subarray.

Maintain two variables:

- `sum` → current subarray sum.
- `maxsum` → maximum subarray sum found so far.

While traversing the array:

1. Add the current element to `sum`.
2. Update `maxsum` with the maximum of `maxsum` and `sum`.
3. If `sum` becomes negative, reset it to `0`.
4. Continue until the end of the array.

A negative sum cannot help a future subarray because adding a negative
sum to the next elements would only decrease their total.

## Example

```text
arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
```

The maximum subarray is:

```text
[4, -1, 2, 1]
```

Its sum is:

```text
4 + (-1) + 2 + 1 = 6
```

Therefore:

```text
Output = 6
```

## Complexity

- Time: O(n)
- Space: O(1)

## Key Takeaway

If the current subarray sum becomes negative, discard it because it
cannot increase the sum of any future subarray.

Kadane's Algorithm finds the maximum subarray sum in a single pass
using constant extra space.

## Solution

See `Solution.java`.