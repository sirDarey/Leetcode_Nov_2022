package leetcodeNov2022;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: November 2022, Day 17
 * Problem 223: RectangleArea
 */

class Day17_223_RectangleArea {
    
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        
        int A1 = (ax2 - ax1) * (ay2 - ay1);
        int A2 = (bx2 - bx1) * (by2 - by1);
        
        int minRight = Math.min(ax2, bx2);
        int maxLeft = Math.max(ax1, bx1);
        int minTop = Math.min(ay2, by2);
        int maxBottom = Math.max(ay1, by1);
        
        int overLapArea = 0;
        
        if (minRight > maxLeft && minTop > maxBottom)
            overLapArea = (minRight - maxLeft) * (minTop - maxBottom);
        
        return A1 + A2 - overLapArea;
    }
}