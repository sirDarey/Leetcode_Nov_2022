package leetcodeNov2022;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: November 2022, Day 21
 * Problem 1926: Nearest Exit From Entrance In Maze
 */

class Day21_1926_NearestExitFromEntranceInMaze {
    
    public int nearestExit(char[][] maze, int[] entrance) {
        Queue <int []> queue = new LinkedList<>();
        int eRow = entrance[0], eCol = entrance[1];
        queue.offer(new int []{eRow, eCol, 0});
        maze[eRow][eCol] = '+';  
        int m = maze.length - 1;
        int n = maze[0].length - 1;
        int [][] dirs = new int [][] {{0,1}, {0,-1}, {1,0}, {-1,0}};

        while (!queue.isEmpty()) {
            int [] current = queue.poll();
            int currentRow = current[0]; 
            int currentCol = current[1]; 
            int currentPos = current[2];
            
            for (int dir [] : dirs) {
                int newRow = currentRow + dir[0]; 
                int newCol = currentCol + dir[1];

                if (newRow >= 0 && newRow <= m && newCol >= 0 && newCol <= n && maze[newRow][newCol] == '.') {
                    if (newRow == m || newRow == 0 || newCol == n || newCol == 0)
                        return currentPos+1; 

                    queue.offer(new int []{newRow, newCol, currentPos+1});
                    maze[newRow][newCol] = '+';  
                }
            }   
        }
        return -1;
    }
}