# Longest Substring Without Repeating Characters

**LeetCode:** [Problem #3](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

**Difficulty:** Medium

**Pattern:** Sliding Window / HashSet

## Approach

Use a sliding window with two pointers:

- `l` → left boundary of the window.
- `r` → right boundary of the window.
- `HashSet` → stores the characters currently present in the window.

While traversing the string:

1. Move `r` from left to right.
2. If the current character is already present in the HashSet, remove
   characters from the left until the duplicate is removed.
3. Add the current character to the HashSet.
4. Calculate the current window length.
5. Keep track of the maximum length.

The window always contains unique characters.

## Example

```text
s = "abcabcbb"
```

Sliding window:

```text
"abc" → length = 3
```

Next character is `a`, which is already present.

Remove characters from the left:

```text
"bca"
```

Continue the process.

The longest substring without repeating characters is:

```text
"abc"
```

Therefore:

```text
Output = 3
```

## Complexity

- Time: O(n)
- Space: O(n)

Each character is added to and removed from the HashSet at most once.

## Key Takeaway

When a problem asks for the longest or shortest substring satisfying
a condition, think about the **Sliding Window** pattern.

Here, the HashSet helps maintain a window containing only unique
characters.

## Solution

See `Solution.java`.