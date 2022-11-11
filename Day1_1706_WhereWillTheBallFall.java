package leetcodeNov2022;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: November 2022, Day 1
 * Problem 1706: Where Will The Ball Fall
 *
 */

class Day1_1706_WhereWillTheBallFall {
    
    public int[] findBall(int[][] grid) {
        
        int m = grid.length, n = grid[0].length;
        int [] result = new int [n];
        
        for (int i=0; i<n; i++) {
            int x = 0, y = i;
            
            while (true) {
                
                if (x == m) {
                    
                    result [i] = y;                    
                    break;    
                        
                } else {                    
                    if (y+1 < n && grid[x][y] == 1 && grid[x][y+1] == 1)
                        y++;
                    else if (y-1 >= 0 && grid[x][y] == -1 && grid[x][y-1] == -1)
                        y--;
                    else {
                        result [i] = -1;
                        break;
                    }
                    x++;        
                }
            }
            
        }
        
        return result;
    }
}