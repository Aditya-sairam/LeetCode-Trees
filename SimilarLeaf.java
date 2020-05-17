//SimilarLeaf problem in leetcode
class SimilarLeaf {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> arr1 = new ArrayList<Integer>();
        List<Integer> arr2 = new ArrayList<Integer>();
        traverse(root1,arr1);
        traverse(root2,arr2);
        return arr1.equals(arr2);
    }
    public void traverse(TreeNode node,List<Integer> array){
        if(node != null){
            if(node.left == null && node.right == null){
                array.add(node.val);
            }
            traverse(node.left,array);
            traverse(node.right,array);
        }
    }
}
