// Definition for a binary tree node.
  public class pre_in {
      int val;
      pre_in left;
      pre_in right;
      pre_in() {}
      pre_in(int val) { this.val = val; }
      pre_in(int val, pre_in left, pre_in right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
class Solution {
    private int idx;
    public pre_in buildTree(int[] preorder, int[] inorder) {
         int  n = preorder.length;
        idx = 0;
        return solve(preorder, inorder, 0, n-1);
    }
    private  pre_in solve(int[] preorder, int[] inorder, int start, int end)
    {
        if(start>end)
        return null;
        pre_in root=new pre_in(preorder[idx]);
        int i=start;
        for(;i<=end;i++)
        {
            if(inorder[i]==root.val)
            break;
        }
        idx++;
        
        root.left=solve(preorder,inorder,start,i-1);
        root.right=solve(preorder,inorder,i+1,end);

        return root;
    }

}