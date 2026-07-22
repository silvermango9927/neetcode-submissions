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
        List<List<Integer>> res = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            List<Integer> lvl = new ArrayList<>();
            int s = q.size();

            for(int i = 0; i < s; i++) {
                TreeNode n = q.poll();
                if(n != null) {
                    lvl.add(n.val);
                    q.add(n.left);
                    q.add(n.right);
                }
                
            }
            if(lvl.size() > 0) {
                res.add(lvl);
            }
            
        }

        return res;

    }
}
