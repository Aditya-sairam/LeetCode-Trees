//Converting a sorted array to Binary Seacrh Tree
class Convertree {
    public TreeNode inserttree(int[] nums,int start,int end){
        if(start >= end){
            return null;
        }
        int mid = start+(end-start)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = inserttree(nums,start,mid);
        root.right = inserttree(nums,mid+1,end);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0){
            return null;
        }
        return inserttree(nums,0,nums.length);
}
}
