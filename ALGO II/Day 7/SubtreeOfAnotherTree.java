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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot==null || root==null) return false;
        if(helper(root,subRoot)) return true;
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    public boolean helper(TreeNode root,TreeNode subRoot){
        if(root==null && subRoot==null){
            return true;
        }
        if(subRoot==null || root==null) return false;
        if(root.val==subRoot.val){
            return helper(root.left,subRoot.left) && helper(root.right,subRoot.right);
        }
        return false;
    }
}