  //Definition for a binary tree node.

import java.util.ArrayList;
import java.util.List;

public class postorder {
     int val;
      postorder left;
      postorder right;
      postorder() {}
      postorder(int val) { this.val = val; }
      postorder(int val, postorder left, postorder right) {
          this.val = val;
          this.left = left;
         this.right = right;
      }
  }
 
class Solution {
    public List<Integer> postorderTraversal(postorder root) {
        List<Integer>  result=new ArrayList<>();
        postorder(root,result);
        return result;
    }
    void postorder(postorder root, List result)
    {
        if(root==null)
        return ;
        
        postorder(root.left,result);
        postorder(root.right,result);
        result.add(root.val);
    }
}