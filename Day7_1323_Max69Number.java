package leetcodeNov2022;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: November 2022, Day 7
 * Problem 1323: Maximum 69 Number
 * 
 */

class Day7_1323_Max69Number {
    
    public int maximum69Number (int num) {
        String numString = String.valueOf(num);
        char [] charArray = numString.toCharArray();
        
        for (int i=0; i<charArray.length; i++) {
            if (charArray[i] == '6') {
                charArray[i] = '9';
                break;
            }
        }
        
        return Integer.parseInt(new String(charArray));
    }
}