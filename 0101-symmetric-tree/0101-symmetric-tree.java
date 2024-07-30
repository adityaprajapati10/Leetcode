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
    public boolean check(TreeNode L , TreeNode R){
        if(L == null && R == null) return true;
        if(L == null || R == null) return false;
        if(L.val != R.val) return false;
        return check(L.left , R.right) && check(L.right , R.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root.left == null || root.right == null) return false;
        if(root.left == null && root.right == null) return true;
        return check(root.left , root.right);
    }
}