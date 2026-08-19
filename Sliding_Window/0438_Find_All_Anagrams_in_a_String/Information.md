# Find All Anagrams in a String

**LeetCode:** [Problem #438](https://leetcode.com/problems/find-all-anagrams-in-a-string/)

**Difficulty:** Medium

**Pattern:** Sliding Window / Frequency Array

## Approach

Use a fixed-size sliding window of size `p.length()` over string `s`.

Maintain two frequency arrays:

- `fre` → frequency of characters in `p`.
- `fre1` → frequency of characters in the current window of `s`.

For every character in `s`:

1. Add the current character to the window.
2. If the window becomes larger than `p.length()`, remove the character that is leaving the window.
3. Once the window size becomes equal to `p.length()`, compare the two frequency arrays.
4. If both arrays are equal, the current window is an anagram of `p`.
5. Store the starting index of the window.

## Sliding Window

## Complexity

- Time: O(n)
- Space: O(1)

The frequency arrays contain only 26 lowercase English characters.