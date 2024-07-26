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
    TreeNode ele1 = null , ele2 = null , prev = null;
    public void inorder(TreeNode root ){
        if(root == null){
            return;
        }
        inorder(root.left );
        if(prev != null && root.val < prev.val ){
            if(ele1 == null){
                ele1 = prev;
            }
            ele2 = root;
        }
        prev = root;
        inorder(root.right );
    }
    public void recoverTree(TreeNode root) {
        inorder(root);
        int temp = ele1.val;
        ele1.val = ele2.val;
        ele2.val = temp;
    }
}