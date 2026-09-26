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

        int flag = 0;// 0 = left to right, 1 = right to left
        Stack<TreeNode> stk = new Stack<>();
        Stack<TreeNode> next = new Stack<>();
        
        stk.push(root);
        List<List<Integer>> res = new ArrayList<>();

        if (root == null) {
            return res;
        }
        
        while (!stk.isEmpty()) {
            int size = stk.size();
            List<Integer> ans = new ArrayList<>();

            for(int i=0;i<size;i++){
                TreeNode node = stk.pop();
                ans.add(node.val);
                
                if(flag == 0){
                    if(node.left!=null){
                        next.push(node.left);
                    }
                    if(node.right!=null){
                        next.push(node.right);
                    }
                }
                else{
                    if(node.right!=null){
                        next.push(node.right);
                    }
                    if(node.left!=null){
                        next.push(node.left);
                    }
                }
            }
            Stack<TreeNode> temp = stk;
            stk = next;
            next = temp;

            flag = 1 - flag;

            res.add(ans);
        }
        return res;

    }
}