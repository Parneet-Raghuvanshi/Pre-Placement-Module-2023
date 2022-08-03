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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        rc(root,ans,0);
        return ans;
    }

    private void rc(TreeNode node,List<Integer> ans,int lvl) {
        if (node == null) return;
        if (lvl == ans.size()) ans.add(node.val);
        rc(node.right,ans,lvl+1);
        rc(node.left,ans,lvl+1);
    }
}