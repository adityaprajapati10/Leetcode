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
    int count = 0;
    int result = -1;
    public int inorderTraversal (TreeNode root , int k){
        if(root == null || count >= k){
            return result;
        }
        inorderTraversal(root.left , k);
        count++;
        if(count == k){
            result = root.val;
            return result;
        }
        inorderTraversal(root.right , k);
        return result;
    }
    public int kthSmallest(TreeNode root, int k) {
        return inorderTraversal(root, k);
    }
}