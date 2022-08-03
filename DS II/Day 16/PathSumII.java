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

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int t) {
        getSum(root,0,t,new ArrayList<>());
        return ans;
    }

    private void getSum(TreeNode root,int sum,int t,List<Integer> path) {
        if (root == null) return;
        sum += root.val;
        path.add(root.val);
        if (sum == t && root.left == null && root.right == null) {
            ans.add(path);
            return;
        }
        if (root.left != null) getSum(root.left,sum,t,new ArrayList<>(path));
        if (root.right != null) getSum(root.right,sum,t,new ArrayList<>(path));
        path.remove(path.size()-1);
        sum -= root.val;
    }
}