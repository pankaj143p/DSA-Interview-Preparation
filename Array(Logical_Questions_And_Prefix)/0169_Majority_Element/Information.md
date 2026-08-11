# Majority Element

**LeetCode:** [Problem #169](https://leetcode.com/problems/majority-element/)

**Difficulty:** Easy

**Pattern:** Boyer-Moore Voting Algorithm

## Approach

Use the Boyer-Moore Voting Algorithm to find the element that appears
more than `n / 2` times.

Maintain two variables:

- `ele` → current candidate for the majority element.
- `cnt` → voting count for the current candidate.

While traversing the array:

1. If `cnt` becomes `0`, select the current element as the new candidate.
2. If the current element is equal to the candidate, increase `cnt`.
3. Otherwise, decrease `cnt`.
4. After finding the candidate, traverse the array again to verify that
   it actually appears more than `n / 2` times.

The idea is that every occurrence of the majority element can cancel
out one occurrence of a different element. Since the majority element
appears more than all other elements combined, it will remain as the
final candidate.

## Example

```text
nums = [2, 2, 1, 1, 1, 2, 2]
```

The voting process leaves:

```text
ele = 2
```

Count occurrences of `2`:

```text
2 appears 4 times
n / 2 = 7 / 2 = 3
```

Since:

```text
4 > 3
```

The majority element is:

```text
2
```

## Complexity

- Time: O(n)
- Space: O(1)

## Key Takeaway

Boyer-Moore Voting Algorithm allows us to find a majority element
without using a HashMap or sorting.

The candidate is found in O(n) time and O(1) extra space.

## Solution

See `Solution.java`.