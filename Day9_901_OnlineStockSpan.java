package leetcodeNov2022;

import java.util.Stack;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: November 2022, Day 9
 * Problem 901: Online Stock Span
 *
 */

class Day9_901_OnlineStockSpan {
    Stack<int[]> stack = new Stack<>();
    
    public int next(int price) {
        int res = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price)
            res += stack.pop()[1];
        stack.push(new int[]{price, res});
        
        return res;
    }
}