
 // Definition for a binary tree node.
  public class in_post {
     int val;
      in_post left;
      in_post right;
      in_post() {}
      in_post(int val) { this.val = val; }
      in_post(int val, in_post left, in_post right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution {
    public in_post buildTree(int[] inorder, int[] postorder) {
        int n=inorder.length;
        return solve(inorder,0,n-1,postorder,0,n-1);
    }
    public in_post solve(int[] inorder, int inS,int inE,int[] postorder,int posS,int posE)
    {
        if(inS>inE)
        return null;
        in_post root=new in_post(postorder[posE]);
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