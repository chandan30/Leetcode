 // Definition for a binary tree node.
 public class Same {
      int val;
      Same left;
      Same right;
      Same() {}
      Same(int val) { this.val = val; }
      Same(int val, Same left, Same right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
class Solution {
    public boolean isSameTree(Same p, Same q) {
        if(p==null && q==null)
        return true;
        if(p==null || q==null)
        return false;
        if(p.val!=q.val)
        return false;

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}