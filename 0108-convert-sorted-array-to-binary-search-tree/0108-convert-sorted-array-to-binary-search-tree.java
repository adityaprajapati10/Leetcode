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
    public static TreeNode getBST(int[] nums , int l , int h){
        if (l > h) {
            return null;
        }
        else{
            int mid = l + (h-l) / 2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = getBST(nums , l , mid-1);
            root.right = getBST(nums , mid+1 , h);
            return root;
        }
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0){
            return null;
        }
        return getBST(nums, 0 , nums.length-1);
    }
}