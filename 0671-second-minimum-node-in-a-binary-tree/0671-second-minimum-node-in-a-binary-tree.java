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
    ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<Integer> getArray(TreeNode root){
        if(root == null){
            return list;
        }
        getArray(root.left);
        if(!list.contains(root.val)){
            list.add(root.val);
        }
        getArray(root.right);
        return list;
    }
    public int findSecondMinimumValue(TreeNode root) {
        getArray(root);
        if(2 > list.size()) return -1;
        return list.get(1);
    }
}