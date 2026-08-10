# Product of Array Except Self

**LeetCode:** [Problem #238](https://leetcode.com/problems/product-of-array-except-self/)

**Difficulty:** Medium

**Pattern:** Array / Prefix & Suffix Product

## Approach

For every index, we need the product of all elements except the
element at that index.

Instead of calculating the product separately for every index,
use two passes.

### First Pass - Prefix Product

Traverse from left to right.

`pr` stores the product of all elements before the current index.

For each index:

1. Store the current prefix product in `ans[i]`.
2. Multiply `pr` by the current element.

### Second Pass - Suffix Product

Traverse from right to left.

`pr1` stores the product of all elements after the current index.

For each index:

1. Multiply `ans[i]` by the current suffix product.
2. Multiply `pr1` by the current element.

After both passes, `ans[i]` contains:

```text
product of elements before i × product of elements after i
```

## Example

```text
nums = [1, 2, 3, 4]
```

After the prefix pass:

```text
ans = [1, 1, 2, 6]
```

After the suffix pass:

```text
ans = [24, 12, 8, 6]
```

Therefore:

```text
Output = [24, 12, 8, 6]
```

## Complexity

- Time: O(n)
- Space: O(1) extra space

The output array is not considered extra space.

## Key Takeaway

Use prefix and suffix products when you need the product of all
elements except the current element.

This approach also handles arrays containing zero without using
division.

## Solution

See `Solution.java`.