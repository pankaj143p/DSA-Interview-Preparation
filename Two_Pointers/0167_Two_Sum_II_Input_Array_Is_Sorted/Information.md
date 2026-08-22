# Two Sum II - Input Array Is Sorted

**LeetCode:** [Problem #167](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)

**Difficulty:** Medium

**Pattern:** Two Pointers

## Approach

Since the array is sorted, use two pointers:

- `left` → starts from the beginning of the array.
- `right` → starts from the end of the array.

Calculate the sum of the elements at both pointers.

```text
sum = numbers[left] + numbers[right]
```

1. If `sum == target`, return the 1-based indices.
2. If `sum < target`, move `left` forward because we need a larger sum.
3. If `sum > target`, move `right` backward because we need a smaller sum.
4. Continue until the pair is found.

## Example

```text
numbers = [2, 7, 11, 15]
target = 9
```

Initially:

```text
left = 0
right = 3

2 + 15 = 17
```

Since `17 > 9`, move `right` backward.

```text
2 + 11 = 13
```

Again, `13 > 9`, so move `right` backward.

```text
2 + 7 = 9
```

The target is found.

Since the problem uses 1-based indexing:

```text
Result = [1, 2]
```

## Complexity

- Time: O(n)
- Space: O(1)

## Key Takeaway

When the array is sorted and we need to find two elements that satisfy
a condition, the Two Pointers technique can reduce the solution to
O(n) time without using extra space.

If the sum is smaller than the target, move `left` forward.

If the sum is larger than the target, move `right` backward.

## Solution

See `Solution.java`.