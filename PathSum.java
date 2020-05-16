//Path sum problem
class PathSum {
    boolean flag = false;
    public boolean hasPathSum(TreeNode root, int sum) {
         
        dfs(root,sum,0);
        return flag;
        
    }
    public void dfs(TreeNode node,int sum,int num){
    if(node == null){
        return ;
    }
    num += node.val;
    dfs(node.left,sum,num);
    dfs(node.right,sum,num);
    if(node.left == null && node.right == null){
        if(sum == num){
            flag = true;
        }
    }
}
}
