# Subarray Sum Equals K

**LeetCode:** [Problem #560](https://leetcode.com/problems/subarray-sum-equals-k/)

**Difficulty:** Medium

**Pattern:** Prefix Sum / HashMap

## Approach

Use a prefix sum and a HashMap to count how many times each prefix sum
has appeared.

For every element:

1. Add the current element to `sum`.
2. If `sum == k`, a valid subarray starts from index `0`.
3. Check whether `sum - k` has appeared before.
4. If it has appeared, add its frequency to the answer.
5. Store the current prefix sum and increase its frequency.

The key idea is:

```text
currentPrefixSum - previousPrefixSum = k
```

Therefore:

```text
previousPrefixSum = currentPrefixSum - k
```

If the same prefix sum has appeared multiple times, each occurrence
represents a different subarray whose sum is `k`.

## Example

```text
nums = [1, 1, 1]
k = 2
```

Prefix sums:

```text
1
2
3
```

When the prefix sum is `2`:

```text
2 - 2 = 0
```

A subarray starting from index `0` has sum `2`.

When the prefix sum is `3`:

```text
3 - 2 = 1
```

Prefix sum `1` has already appeared, so another valid subarray exists.

Therefore:

```text
Output = 2
```

The valid subarrays are:

```text
[1, 1]
[1, 1]
```

## Complexity

- Time: O(n)
- Space: O(n)

## Key Takeaway

When a problem asks for the number of subarrays with a specific sum,
think about **Prefix Sum + HashMap**.

The HashMap stores the frequency of previous prefix sums, allowing us
to count valid subarrays in O(1) average time for each element.

## Solution

See `Solution.java`.