package leetcodeNov2022;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: November 2022, Day 8
 * Problem 1544: Make The String Great
 *
 */

class Day8_1544_MakeTheStringGreat {
    
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            int n = sb.length();
            if (n > 0 && Math.abs(sb.charAt(n-1) - c) == 32)
                sb.deleteCharAt(n-1);
            else
                sb.append(c);
        }        
        return sb.toString();
    }
}