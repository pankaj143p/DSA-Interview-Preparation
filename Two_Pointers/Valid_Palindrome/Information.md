# Valid Palindrome

**LeetCode:** [Problem #125](https://leetcode.com/problems/valid-palindrome/)

**Difficulty:** Easy

**Pattern:** Two Pointers / String

## Approach

Use two pointers:

- `start` → starts from the beginning of the string.
- `last` → starts from the end of the string.

Move both pointers toward the center.

While traversing the string:

1. If the character at `start` is not a letter or digit, move `start` forward.
2. If the character at `last` is not a letter or digit, move `last` backward.
3. If both characters are valid, compare them after converting them to lowercase.
4. If they are different, return `false`.
5. If they are equal, move both pointers toward the center.
6. If all characters match, return `true`.

Non-alphanumeric characters are ignored.

## Example

```text
s = "A man, a plan, a canal: Panama"
```

After ignoring spaces and special characters:

```text
amanaplanacanalpanama
```

The string reads the same from both directions.

```text
Output = true
```

## Complexity

- Time: O(n)
- Space: O(1)

## Key Takeaway

Two pointers are useful when we need to compare elements from both
ends of a sequence.

Here, we skip non-alphanumeric characters and compare the remaining
characters from left and right.

## Solution

See `Solution.java`.