package leetcodeNov2022;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: November 2022, Day 3
 * Problem 2131: Longest Palindrome by Concatenating Two Letter Words
 *
 */

class Day3_2131_LongPalindromeByConcat2LetterWords {
    
    public int longestPalindrome(String[] words) {
        Map <String, Integer> map = new HashMap <> ();
        char [] newWord = new char [2];
        int result = 0; 
        
        for (String word : words) {
            newWord[0] = word.charAt(1);
            newWord[1] = word.charAt(0);
            String newString = new String(newWord);
            
            if (map.containsKey(newString)) {
                map.put(newString, map.get(newString)-1); 
                if (map.get(newString) == 0)
                    map.remove(newString);
                result += 4;
            } else
                map.put (word, map.getOrDefault(word, 0) +1);            
        }
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getKey().charAt(0) == entry.getKey().charAt(1)) {
                result += 2;
                break;
            }                
        }
        
        return result;
    }
}