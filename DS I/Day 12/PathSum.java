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
    public boolean hasPathSum(TreeNode root, int t) {
        return getSum(root,0,t);
    }

    boolean getSum(TreeNode root,int sum,int t) {
        if (root == null) return false;
        sum += root.val;
        if (sum == t && root.left == null && root.right == null) return true;
        if (getSum(root.left,sum,t) || getSum(root.right,sum,t)) return true;
        sum -= root.val;
        return false;
    }
}