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
    public List<Integer> inorder(TreeNode root , List<Integer> list){
        if(root == null){
            return list;
        }
        inorder(root.left , list);
        list.add(root.val);
        inorder(root.right , list);
        return list;
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        return getBST(list , 0 , list.size()-1);
    }
    public TreeNode getBST(List<Integer> list , int i , int j){
        if(i > j){
            return null;
        }else{
            int mid = i+(j-i)/2;
            TreeNode node = new TreeNode(list.get(mid));
            node.left = getBST(list, i , mid-1);
            node.right = getBST(list , mid+1 , j);
            return node;
        }
    }
}