//Kth minimum element in a binary Tree
class Kmin {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> array = new ArrayList<Integer>();
        traverse(root,array);
        return kmin(array,k);
        
    }
    public void traverse(TreeNode root,List<Integer> list){
        if(root != null){
            list.add(root.val);
            if(root.left != null){
                traverse(root.left,list);
            }
            if(root.right != null){
                traverse(root.right,list);
            }
        }
    }
    public int kmin(List<Integer> list,int k){
        List<Integer> newlist = new ArrayList<Integer>();
            Collections.sort(list);         

        int i;
        for(i=0;i<list.size();i++){
            if(!newlist.contains(list.get(i))){
                newlist.add(list.get(i));
            }
        }
        return list.get(k-1);
    }
}
