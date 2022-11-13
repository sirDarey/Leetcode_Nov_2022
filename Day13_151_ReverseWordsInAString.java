package leetcodeNov2022;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: November 2022, Day 13
 * Problem 151: Reverse Words in a String
 */

class Day13_151_ReverseWordsInAString {
    public String reverseWords(String s) {
        String S = s.trim();
        String ans = "";
        
        int i = S.length()-1;
        int j = i+1;
        while (i >= 0) {
            if (S.charAt(i) == ' ') {
                ans += S.substring(i+1, j) + " ";
                i--;
                
                while(i > 0 && S.charAt(i) == ' ')
                    i--;
                j = i+1;                
            } else {
                i--;
            }
        }
        
        ans += S.substring(0, j); 
        return ans;
    }
}