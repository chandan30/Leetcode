 //Definition for a binary tree node.

import java.util.ArrayList;
import java.util.List;

public class preorder {
      int val;
      preorder left;
      preorder right;
      preorder() {}
      preorder(int val) { this.val = val; }
      preorder(int val, preorder left, preorder right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Solution {
    public List<Integer> preorderTraversal(preorder root) {
        List<Integer> result = new ArrayList<>();
        preorder(root,result);
        return result;

    }
    void preorder(preorder root,List result)
    {
        if(root==null)
            return ;
        result.add(root.val);
        preorder(root.left,result);
        preorder(root.right,result);

    } 
}