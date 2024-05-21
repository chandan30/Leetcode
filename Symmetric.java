 // Definition for a binary tree node.
  public class Symmetric {
      int val;
      Symmetric left;
      Symmetric right;
      Symmetric() {}
      Symmetric(int val) { this.val = val; }
      Symmetric(int val, Symmetric left, Symmetric right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution {
    public boolean isSymmetric(Symmetric root) {
        if(root==null){
        return true;
        }
        return check(root.left,root.right);
    }
    public boolean check(Symmetric l,Symmetric r)
    {
        if(l==null && r==null){
        return true;
        }
        if(l==null || r==null){
        return false;
        }
        return l.val==r.val && check(l.left,r.right) && check(l.right,r.left);
            
    }
}