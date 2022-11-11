package leetcodeNov2022;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: November 2022, Day 11
 * Problem 26: Remove Duplicates from Sorted Array
 */

class Day11_26_RemoveDupFromSortedArray {
    
    public int removeDuplicates(int[] nums) {
        int k = 0;
        
        for (int i=1; i<nums.length; i++) {
            if (nums[i] == nums[k])
                continue;
            k++;
            nums [k] = nums[i];
        }
        
        return k+1;
    }
}