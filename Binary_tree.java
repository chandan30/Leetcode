
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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode>q=new ArrayDeque<>();
        ArrayList<Integer>ans=new ArrayList<>();
        if(root==null)
        return ans;
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
        ArrayList<Integer>l=new ArrayList<>();
        while(n-->0)
        {
            l.add(q.peek().val);
            if(q.peek().left!=null)
            q.offer(q.peek().left);
            if(q.peek().right!=null)
            q.offer(q.peek().right);

            q.poll();
        }    
        ans.add(l.get(l.size()-1));
        }
        return ans;
        
    }
}