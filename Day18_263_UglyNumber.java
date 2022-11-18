package leetcodeNov2022;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: November 2022, Day 18
 * Problem 263: UglyNumber
 */

class Day18_263_UglyNumber {
    
    public boolean isUgly(int n) {
        if (n == 1)
            return true;
        if (n == 0)
            return false;
        
        if (n%2 == 0)
            return isUgly(n/2);
        else if (n%3 == 0)
            return isUgly(n/3);
        else if (n%5 == 0)
            return isUgly(n/5);
        
        return false;
    }
}