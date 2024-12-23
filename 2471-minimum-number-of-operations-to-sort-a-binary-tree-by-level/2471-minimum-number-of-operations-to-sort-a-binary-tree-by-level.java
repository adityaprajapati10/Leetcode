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
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int count = 0;
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = q.size();
            for(int i = 0 ; i<size; i++){
                TreeNode curr = q.poll();
                list.add(curr.val);
                if (curr.left != null) q.add(curr.left);  
                if (curr.right != null) q.add(curr.right);
            }
            count += minSwap(list);
        }
        return count;
    }
    public int minSwap(List<Integer> list){
        int swap = 0;
        ArrayList<Integer> sorted = new ArrayList<>(list);
        Collections.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<list.size(); i++){
            map.put(list.get(i), i);
        }

        for(int i = 0; i<list.size() ; i++){
            if(list.get(i).equals(sorted.get(i))){
                continue;
            }
                
            int curridx = map.get(sorted.get(i));
            map.put(list.get(i), curridx);
            map.put(list.get(curridx), i);
            Collections.swap(list, curridx, i);
            swap++;
        }
        return swap;
    }
}