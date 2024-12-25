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
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        while(!q.isEmpty()){
            int maxEl = Integer.MIN_VALUE;
            int size = q.size();
            for(int i = 0; i<size ; i++){
                TreeNode curr = q.poll();
                maxEl = Math.max(maxEl, curr.val);
                if(curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            ans.add(maxEl);
        }
        return ans;
    }
}