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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> wl = new LinkedList<>();
        if (root == null) return wl;
        q.offer(root);
        while (!q.isEmpty()) {
            int l = q.size();
            List<Integer> tmp = new LinkedList<>();
            for (int i=0;i<l;i++) {
                if (q.peek().left != null) q.offer(q.peek().left);
                if (q.peek().right != null) q.offer(q.peek().right);
                tmp.add(q.poll().val);
            }
            wl.add(tmp);
        }
        return wl;
    }
}