# Valid Anagram

**LeetCode:** [Problem #242](https://leetcode.com/problems/valid-anagram/)

**Difficulty:** Easy

**Pattern:** String / Frequency Array

## Approach

Use a frequency array of size `26` to count the occurrences of each
lowercase English letter.

While traversing both strings:

1. Increase the frequency for the character from `s`.
2. Decrease the frequency for the character from `t`.
3. After processing both strings, every frequency should be `0`.
4. If any frequency is not `0`, the strings are not anagrams.

First, check whether both strings have the same length. If their
lengths are different, they cannot be anagrams.

## Example

```text
s = "anagram"
t = "nagaram"
```

Frequency changes cancel each other:

```text
a → 0
g → 0
m → 0
n → 0
r → 0
```

All frequencies are `0`, so:

```text
Output = true
```

## Complexity

- Time: O(n)
- Space: O(1)

The frequency array always contains 26 elements, so its size is
constant.

## Key Takeaway

A frequency array is an efficient way to compare character
frequencies when the character set is fixed.

Instead of sorting both strings, we can solve the problem in
O(n) time.

## Solution

See `Solution.java`.