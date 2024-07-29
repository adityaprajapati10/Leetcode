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
    public void traverse(List<String> list , String str , TreeNode root){
        if(root.left == null && root.right == null){
            str += root.val;
            list.add(str);
        }
        else{
            str += (root.val) + "->";
            if(root.right != null){
                traverse(list , str , root.right);
            }
            if(root.left != null){
                traverse(list , str , root.left);
            }
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
       List<String> list = new ArrayList<>();
       String str = "";
       traverse(list ,  str , root); 
        return list;
    }
}