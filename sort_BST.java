 // Definition for a binary tree node.
  public class sort_BST {
      int val;
      sort_BST left;
      sort_BST right;
      sort_BST() {}
      sort_BST(int val) { this.val = val; }
      sort_BST(int val, sort_BST left, sort_BST right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution {
    public sort_BST sortedArrayToBST(int[] nums) {
        return create(nums,0,nums.length-1);
    }
    private sort_BST create(int[] nums, int low, int high)
    {
        if(low>high)
        return null;
        int mid=low+(high-low)/2;
        sort_BST root=new sort_BST(nums[mid]);
        root.left=create(nums,low,mid-1);
        root.right=create(nums,mid+1,high);
        return root;
    }
}