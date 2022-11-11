package leetcodeNov2022;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: November 2022, Day 10
 * Problem 1047: Remove All Adjacent Duplicates In String
 *
 */

class Day10_1047_RemoveAllAdjDuplInStr {
    
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int n = sb.length();
            if (n > 0 && sb.charAt(n-1) == c) {
                sb.deleteCharAt(n-1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}