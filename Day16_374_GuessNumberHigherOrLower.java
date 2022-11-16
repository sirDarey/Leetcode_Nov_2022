package leetcodeNov2022;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: November 2022, Day 16
 * Problem 374: Guess Number Higher or Lower
 */

class Day16_374_GuessNumberHigherOrLower {
    
    public int guessNumber(int n) {
        int low = 1, high = n;
        
        while (low < high) {
            int mid = low + (high - low)/2;
            
            if (guess(mid) == -1)
                high = mid;
            else if(guess(mid) == 1)
                low = mid + 1;
            else
                return mid;
        }
            
        return low;
    }
    
    //This function is an API predefined already in the problem statement
    int guess(int num) {
        return 0; //I'm just returning 0 to prevent compile time error from my IDE
    }
}