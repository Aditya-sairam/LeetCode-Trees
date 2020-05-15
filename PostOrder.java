//Postorder Tree traversal
class PostOrder {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        traverse(root,res);
        return res;
    }
    public void traverse(TreeNode node,List<Integer> list){
        if(node != null){
            if(node.left != null){
                traverse(node.left,list);
            }
            if(node.right != null){
                traverse(node.right,list);
            }
            list.add(node.val);
        }
    }
}
