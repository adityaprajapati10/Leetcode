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
    public String getSubTree(TreeNode root , List<TreeNode>list , HashMap<String , Integer>map ){
        if(root == null){
            return "N";
        }
        String s = root.val + "," + getSubTree(root.left , list , map ) +"," +
        getSubTree(root.right , list , map);
        map.put(s, map.getOrDefault(s, 0) + 1);
        if(map.containsKey(s) && map.get(s) == 2){
            list.add(root);
        }
        return s;
    }
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        HashMap<String , Integer> map = new HashMap<>();
        List<TreeNode> list = new ArrayList<>();
        getSubTree(root , list, map);
        return list;
    }
}