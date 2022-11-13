package leetcodeNov2022;

import java.util.Arrays;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: November 2022, Day 6
 * Problem 899: Orderly Queue
 *
 */

class Day6_899_OrderlyQueue {
    public String orderlyQueue(String s, int k) {
        if (k == 1) {
            String ans = s;
            for (int i=1; i<s.length(); i++) {
                String temp = s.substring(i) + s.substring(0, i);
                if (temp.compareTo(ans) < 0)
                    ans = temp; 
            }
            return ans;
        }
        
        char [] sArray = s.toCharArray();
        Arrays.sort(sArray);
        return new String(sArray);
    }
}