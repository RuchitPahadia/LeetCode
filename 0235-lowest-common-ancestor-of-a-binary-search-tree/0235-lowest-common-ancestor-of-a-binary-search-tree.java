/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return root;
        }
        while(root!=null){
            //when both are smaller
            if(p.val<root.val && q.val<root.val){
                root = lowestCommonAncestor(root.left,p,q);
            }
            //when both are greater
            if(p.val>root.val && q.val>root.val){
                root = lowestCommonAncestor(root.right,p,q);

            }
            //when there is one greater and one smaller we have found the solution
            else{
                return root;
            }
        }
        return null;
    }
}