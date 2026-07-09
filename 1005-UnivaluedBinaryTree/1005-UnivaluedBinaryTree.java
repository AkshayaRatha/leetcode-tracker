// Last updated: 7/9/2026, 9:14:09 AM

class Solution {
    private boolean uni(TreeNode root,int val) {
        if(root==null)return true;
        if(root.val!=val)return false;
        boolean l=uni(root.left,val);
        boolean r=uni(root.right,val);
        return(l&&r);
    }
    public boolean isUnivalTree(TreeNode root){
        int val=root.val;
        return uni(root,val);
    }
}