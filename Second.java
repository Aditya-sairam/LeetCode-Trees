//Find the second minimum element in a binary tree
import java.util.*; 

class Second {
    public int findSecondMinimumValue(TreeNode root) {
        List<Integer> finale = new ArrayList<Integer>();
        traverse(root,finale);
        return min(finale);
        
        
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
    public int min(List<Integer> list){
        Collections.sort(list);
        
        List<Integer> newlist = new ArrayList<Integer>();
        int i;
        for(i=0;i<list.size();i++){
            if(!newlist.contains(list.get(i))){
                newlist.add(list.get(i));
            }
        }
        if(newlist.size() == 1){
            return -1;
        }
        
        return newlist.get(1);
        
    }
}
