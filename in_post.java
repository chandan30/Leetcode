/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=inorder.length;
        return solve(inorder,0,n-1,postorder,0,n-1);
    }
    public TreeNode solve(int[] inorder, int inS,int inE,int[] postorder,int posS,int posE)
    {
        if(inS>inE)
        return null;
        TreeNode root=new TreeNode(postorder[posE]);
        int idx=0;
        for(int i=0;i<inorder.length;i++)
        {
            if(inorder[i]==root.val){
                idx=i;
                break;
            }
        }
        root.left=solve(inorder,inS,idx-1,postorder,posS,posS+idx-inS-1);
        root.right=solve(inorder,idx+1,inE,postorder,posS+idx-inS,posE-1);

        return root;
    }
}