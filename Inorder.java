//Inorder Tree traversal 
class Inorder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> array = new ArrayList<Integer>();
        traverse(root,array);
        return array;
    }
    public void traverse(TreeNode node,List<Integer> list){
        if(node != null){
            if(node.left != null){
                traverse(node.left,list);
            }
            list.add(node.val);
            if(node.right != null){
                traverse(node.right,list);
            }
        }
    }
}
