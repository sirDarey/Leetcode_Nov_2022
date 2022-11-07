package leetcodeNov2022;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @Sir Darey
 * 
 *
 */

class _345_ReverseVowelsOfAString {
    
    public String reverseVowels(String s) {
        char [] sArray = s.toCharArray();
        Stack <Character> stack = new Stack<>();
        Set <Character> set = new HashSet <>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        
        for (char c : sArray)
            if(set.contains(c))
                stack.push(c);
        
        for (int i=0; i<sArray.length; i++)
            if (set.contains(sArray[i]))
                sArray[i] = stack.pop();
        
        return new String(sArray);
    }
}