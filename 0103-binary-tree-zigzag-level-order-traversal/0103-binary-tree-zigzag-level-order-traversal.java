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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int count = 2;

        while(!queue.isEmpty()){
            List<Integer> result = new ArrayList<>();
            int n = queue.size();
            for(int i=0;i<n;i++){
                TreeNode temp = queue.poll();
                if(count%2==0){
                    result.add(temp.val);
                }else{
                    result.add(0, temp.val);
                }

                if(temp.left != null){
                    queue.add(temp.left);
                }
                if(temp.right != null){
                    queue.add(temp.right);
                }
            }
            count++;
            list.add(result);
        }
        return list;
    }
}