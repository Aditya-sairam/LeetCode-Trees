//Return if a tree's left and right sub trees are symmetric
class Solution {
    public boolean issame(TreeNode t1,TreeNode t2){
        if(t1 == null && t2 == null){
            return true;
        }
        if(t1 ==  null || t2 == null){
            return false;
        }
        return(t1.val == t2.val)&& issame(t1.right,t2.left)&& issame(t1.left,t2.right);
    }
    
    public boolean isSymmetric(TreeNode root) {
        
        return issame(root,root);
        }
        
    }
