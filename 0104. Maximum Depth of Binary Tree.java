/**
https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max = 0;
    public int maxDepth(TreeNode root) {
        maxD(root, 0);
        return max;
    }
    public void maxD(TreeNode root, int n) {
        if(root != null) {
            maxD(root.left, n+1);
            maxD(root.right, n+1);
        }
        if(n > max)
            max = n;
    }
}