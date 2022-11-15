package leetcodeNov2022;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: November 2022, Day 15
 * Problem 222: Count Complete Tree Nodes
 */

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

class Day15_222_CountCompleteTreeNodes {
    
    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}