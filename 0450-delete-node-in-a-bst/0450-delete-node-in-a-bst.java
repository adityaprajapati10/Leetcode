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
    public List<Integer> inorder(TreeNode root , int key, List<Integer> list){
        if(root == null) return list;
        inorder(root.left , key , list);
        if(root.val != key){
            list.add(root.val);
        }
        inorder(root.right , key , list);
        return list;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        List<Integer> list = new ArrayList<>();
        inorder(root, key , list);
        return getBST(list , 0 , list.size()-1);
    }
    public TreeNode getBST(List<Integer> list , int l , int h){
        if (l > h) {
            return null;
        }
        int mid = l + (h - l) / 2;
        TreeNode newRoot = new TreeNode(list.get(mid));
        newRoot.left = getBST(list, l, mid - 1);
        newRoot.right = getBST(list, mid + 1, h);
        return newRoot;
    }
}