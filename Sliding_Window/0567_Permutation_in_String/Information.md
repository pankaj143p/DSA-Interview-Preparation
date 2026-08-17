# Permutation in String

**LeetCode:** [Problem #567](https://leetcode.com/problems/permutation-in-string/)

**Difficulty:** Medium

**Pattern:** Sliding Window / Frequency Array

## Approach

Use a sliding window of size `s1.length()` over `s2`.

Maintain two frequency arrays:

- `fr1` → frequency of characters in `s1`.
- `fr2` → frequency of characters in the current window of `s2`.

First, create the initial window of size `s1.length()`.

Then slide the window one position at a time:

1. Remove the character leaving the window.
2. Add the new character entering the window.
3. Compare `fr1` and `fr2`.
4. If both frequency arrays are equal, the current window is a permutation of `s1`.

## Sliding Window

The window always contains exactly `s1.length()` characters.

For example:

```text
s1 = "ab"
s2 = "eidbaooo"