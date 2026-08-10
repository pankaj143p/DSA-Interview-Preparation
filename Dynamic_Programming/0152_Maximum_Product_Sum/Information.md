# Maximum Product Subarray

**LeetCode:** [Problem #152](https://leetcode.com/problems/maximum-product-subarray/)

**Difficulty:** Medium

**Pattern:** Dynamic Programming / Kadane's Algorithm

## Approach

Use two variables to keep track of the maximum and minimum product
of a subarray ending at the current index.

- `mx` → maximum product ending at the current index.
- `mn` → minimum product ending at the current index.

We need both because a negative number can turn the minimum product
into the maximum product.

While traversing the array:

1. Calculate the maximum product using the current number, `mn`, and `mx`.
2. Calculate the minimum product using the current number, `mn`, and `mx`.
3. Update `mn` and `mx`.
4. Update the overall result.

There are three possibilities:

```text
current number
current number × minimum product
current number × maximum product
```

## Complexity

- Time: O(n)
- Space: O(1)

## Key Takeaway

When negative numbers are present, tracking only the maximum product
is not enough.

A negative number can turn the previous minimum product into the
maximum product, so we need to track both `mn` and `mx`.

## Solution

See `Solution.java`.