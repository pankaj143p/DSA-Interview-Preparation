# Group Anagrams

**LeetCode:** [Problem #49](https://leetcode.com/problems/group-anagrams/)

**Difficulty:** Medium

**Pattern:** HashMap / Frequency Counting

## Approach

Use a HashMap to group strings that are anagrams.

Instead of sorting every string, use a frequency array of size `26` to
count the occurrences of each lowercase character.

For every string:

1. Create a frequency array of size `26`.
2. Count the frequency of each character.
3. Convert the frequency array into a unique string key.
4. Use the key in the HashMap.
5. Add the current string to the corresponding group.

Anagrams have exactly the same character frequencies, so they generate
the same key.

## Example

```text
strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
```

Frequency representation:

```text
eat → a:1, e:1, t:1
tea → a:1, e:1, t:1

tan → a:1, n:1, t:1
nat → a:1, n:1, t:1

bat → a:1, b:1, t:1
```

Therefore:

```text
[
    ["eat", "tea", "ate"],
    ["tan", "nat"],
    ["bat"]
]
```

## Complexity

- Time: O(n × m)
- Space: O(n × m)

Where:

- `n` = number of strings
- `m` = maximum length of a string

We count characters in each string in `O(m)` time and avoid sorting.

## Key Takeaway

Instead of sorting every string in `O(m log m)`, use character
frequency counting to create a common key for anagrams.

This improves the time complexity from:

```text
O(n × m log m)
```

to:

```text
O(n × m)
```

## Solution

See `Solution.java`.