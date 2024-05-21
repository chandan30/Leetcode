import java.util.ArrayList;
import java.util.List;

 // Definition for a binary tree node.
  public class Inorder {
      int val;
      Inorder left;
      Inorder right;
      Inorder() {}
      Inorder(int val) { this.val = val; }
      Inorder(int val, Inorder left, Inorder right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution {
    public List<Integer> inorderTraversal(Inorder root) {
        List<Integer> result=new ArrayList<>();
        inorder(root,result);
        return result;
    }
    public void inorder(Inorder root,List result)
    {
        if(root==null)
        return ;
        inorder(root.left,result);
        result.add(root.val);
        inorder(root.right,result);
    }
}