# Minimum Window Substring

**LeetCode:** [Problem #76](https://leetcode.com/problems/minimum-window-substring/)
**Difficulty:** Hard

**Pattern:** Sliding Window / Frequency Array

## Approach

Use a sliding window with two pointers:

* `left` → left boundary of the window.
* `right` → right boundary of the window.
* `freq[]` → stores the frequency of characters required from `t`.
* `count` → tracks how many required characters are currently present in the window.

While traversing the string:

1. Move `right` from left to right.
2. If the current character is required, increment `count`.
3. Decrease its frequency in the `freq[]` array.
4. When `count == t.length()`, the current window contains all characters of `t`.
5. Move `left` forward to shrink the window.
6. Update the minimum window whenever a smaller valid window is found.
7. Stop shrinking when the window is no longer valid.

The window always contains all required characters while `count == t.length()`.

## Example

```text
s = "ADOBECODEBANC"
t = "ABC"
```

Initially, we expand the window until all characters `A`, `B`, and `C` are found.

```text
"ADOBEC" → valid window
```

Now shrink the window from the left.

Continue expanding and shrinking:

```text
"ADOBEC" → length = 6
"BANC"    → length = 4
```

The smallest valid window is:

```text
"BANC"
```

Therefore:

```text
Output = "BANC"
```

## Complexity

* Time: `O(n + m)`
* Space: `O(1)`

Where:

* `n` = length of `s`
* `m` = length of `t`

Each character is processed by the sliding window at most a constant number of times.

The frequency array has a fixed size of `256`, so the auxiliary space is `O(1)`.

## Key Takeaway

When a problem asks for the **minimum or maximum substring satisfying a condition**, think about the **Sliding Window** pattern.

Here, the frequency array helps track the characters required from `t`, while two pointers help expand and shrink the window efficiently.

## Solution

See `Solution.java`.
