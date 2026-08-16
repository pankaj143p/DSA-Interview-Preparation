# Longest Repeating Character Replacement

**LeetCode:** [Problem #424](https://leetcode.com/problems/longest-repeating-character-replacement/)

**Difficulty:** Medium

**Pattern:** Sliding Window / HashMap

## Approach

Use a sliding window with two pointers:

- `j` → left boundary of the window.
- `i` → right boundary of the window.
- `mp` → stores the frequency of each character in the current window.
- `mx` → maximum frequency of a single character in the current window.
- `ans` → maximum valid window length found so far.

For every character:

1. Add the current character to the frequency map.
2. Update `mx` with the highest character frequency.
3. Calculate how many characters need to be replaced:

```text
Window Size - Maximum Character Frequency
```

4. If the number of replacements is greater than `k`, move the left
   pointer and remove the left character from the map.
5. Update the maximum valid window length.

## Key Formula

```text
Characters to Replace =
Window Size - Maximum Character Frequency
```

The window is valid when:

```text
Window Size - Maximum Character Frequency <= k
```

## Example

```text
s = "AABABBA"
k = 1
```

Consider the window:

```text
"AABA"
```

Character frequencies:

```text
A = 3
B = 1
```

Window size:

```text
4
```

Maximum frequency:

```text
3
```

Characters to replace:

```text
4 - 3 = 1
```

Since:

```text
1 <= k
```

the window is valid.

We can change `B` to `A`:

```text
"AAAA"
```

Therefore, the maximum length is:

```text
4
```

## Complexity

- Time: O(n)
- Space: O(1)

There are only 26 possible uppercase English characters, so the map
contains at most 26 entries.

## Key Takeaway

For substring problems where you need the longest window satisfying a
condition, consider the **Sliding Window** pattern.

Here, the important observation is:

```text
Window Size - Most Frequent Character
```

represents the minimum number of replacements needed to make the entire
window contain the same character.

## Solution

See `Solution.cpp`.