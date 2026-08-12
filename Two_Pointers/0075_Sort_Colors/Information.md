# Sort Colors

**LeetCode:** [Problem #75](https://leetcode.com/problems/sort-colors/)

**Difficulty:** Medium

**Pattern:** Two Pointers / Dutch National Flag Algorithm

## Approach

Use three pointers to divide the array into three regions:

- `i` → position where the next `0` should be placed.
- `m` → current element being processed.
- `j` → position where the next `2` should be placed.

The array is divided into:

```text
[0 ... i-1]     → 0s
[i ... m-1]     → 1s
[m ... j]       → unknown
[j+1 ... n-1]   → 2s
```

While `m <= j`:

1. If `nums[m] == 0`, swap it with `nums[i]`, then move both `i` and `m`.
2. If `nums[m] == 1`, simply move `m`.
3. If `nums[m] == 2`, swap it with `nums[j]` and move `j`.
4. Do not move `m` after swapping with `j` because the new element at `m`
   has not been processed yet.

## Example

```text
nums = [2, 0, 2, 1, 1, 0]
```

After applying the Dutch National Flag algorithm:

```text
nums = [0, 0, 1, 1, 2, 2]
```

## Complexity

- Time: O(n)
- Space: O(1)

## Key Takeaway

The Dutch National Flag Algorithm sorts an array containing three
different values in a single pass using constant extra space.

When swapping `2` with the element at `j`, do not increment `m`
because the newly swapped element still needs to be processed.

## Solution

See `Solution.java`.