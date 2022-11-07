package leetcodeNov2022;

/**
 *
 * @Sir Darey
 * 
 *
 */

class _1323_Max69Number {
    
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