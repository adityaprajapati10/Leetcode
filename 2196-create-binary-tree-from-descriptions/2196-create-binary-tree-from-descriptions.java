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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer , TreeNode> map = new HashMap<>();
        Set<Integer> childSet = new HashSet<>();
        for(int[] info : descriptions){
            int parent = info[0];
            int child = info[1];
            boolean isleft = info[2] == 1;
            if(!map.containsKey(parent)){
                map.put(parent , new TreeNode(parent));
            }
            if(!map.containsKey(child)){
                map.put(child , new TreeNode(child));
            }
            if(isleft){
                map.get(parent).left = map.get(child);
            }
            else{
                map.get(parent).right = map.get(child);
            }
            childSet.add(child);
        }
        for(int[] info : descriptions){
            if(!childSet.contains(info[0])){
                return map.get(info[0]);
            }
        }
        return new TreeNode(0);
    }
}