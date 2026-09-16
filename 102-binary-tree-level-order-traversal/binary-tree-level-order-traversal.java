class Solution {
    public List<List<Integer>> levelOrder(TreeNode node) {
        List<List<Integer>> res = new ArrayList<>();
        if (node == null) {
            return res;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);//add first element
        
        while (!q.isEmpty()) {
            int size = q.size();//to add elements of curr lwvwl from bottom and remove old from bottom

            List<Integer> level = new ArrayList<>();//create a array to store the elements in a level

            for(int i=0;i<size;i++){
                TreeNode root = q.poll();//go to next node of prev level 

                level.add(root.val);//add the node of this level

                if(root.left!=null){//add left node 
                    q.add(root.left);
                }
                if(root.right!=null){//add right node
                    q.add(root.right);
                }
            }
            res.add(level);//update result
        }
        return res;
    }
}