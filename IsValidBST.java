//Given a binary tree check if it is a BST
class IsValidBST {
    public boolean isvalid(TreeNode node,Integer down,Integer up){
        if(node == null){
            return true;
        }
        int val = node.val;
        if(down != null && val <= down){
            return false;
        }
        if(up != null && val >= up){
            return false;
        }
        if(!(isvalid(node.right,val,up))){
            return false;
        }
        if(!(isvalid(node.left,down,val))){
            return false;
        }
        return true;
    }
    public boolean isValidBST(TreeNode root) {
        return isvalid(root,null,null);
        
    }
}
