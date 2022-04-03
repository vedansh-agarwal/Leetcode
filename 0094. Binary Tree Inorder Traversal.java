/**
https://leetcode.com/problems/binary-tree-inorder-traversal/
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
    ArrayList<Integer> arr;
    public List<Integer> inorderTraversal(TreeNode root) {
        arr = new ArrayList<>();
        recursion(root);
        return arr;
    }
    public void recursion(TreeNode root)
    {
        if(root != null)
        {
            recursion(root.left);
            arr.add(root.val);
            recursion(root.right);
        }
            
    }
}