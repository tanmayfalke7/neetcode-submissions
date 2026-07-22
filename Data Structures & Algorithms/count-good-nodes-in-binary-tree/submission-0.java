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
    public int func(TreeNode root, int x){
         if(root==null) return 0;
         int count=0;
         if(root.val>=x) count = 1;
         x = Math.max(x,root.val);
         count+=func(root.left,x);
         count+=func(root.right,x);
         return count;
    }
    public int goodNodes(TreeNode root) {
        return func(root,root.val);
    }
}
