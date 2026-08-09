# Best Time to Buy and Sell Stock

**LeetCode:** [Problem #121](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)

**Difficulty:** Easy

**Pattern:** Greedy / One Pass

## Approach

We need to buy at a low price and sell at a higher price later.

While traversing the array:

1. Keep track of the minimum price seen so far.
2. Calculate the profit if we sell at the current price.
3. Keep track of the maximum profit.
4. Update the minimum price whenever we find a smaller price.

This allows us to solve the problem in a single pass without using extra space.

## Complexity

- Time: O(n)
- Space: O(1)

## Key Takeaway

While calculating maximum profit, keep track of the minimum buying
price seen so far and calculate the profit for each selling price.

## Solution

See [`Solution.java`](Solution.java).