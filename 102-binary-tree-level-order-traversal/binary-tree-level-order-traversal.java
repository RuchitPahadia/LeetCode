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


 //
class Solution {
    public List<List<Integer>> levelOrder(TreeNode node) {
        List<List<Integer>> res = new ArrayList<>();
        if (node == null) {
            return res;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);//add first element
        
        while (!q.isEmpty()) {
            int size = q.size();

            List<Integer> level = new ArrayList<>();//create a array to store the elements

            for(int i=0;i<size;i++){
                TreeNode root = q.poll();

                level.add(root.val);

                if(root.left!=null){
                    q.add(root.left);
                }
                if(root.right!=null){
                    q.add(root.right);
                }
            }
            res.add(level);
        }
        return res;
    }
}