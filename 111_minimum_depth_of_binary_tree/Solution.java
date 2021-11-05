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
    public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int right = minDepth(root.right);
        int left = minDepth(root.left);
        int min = Math.min(right,left);
        
        int ret = 1 + Math.max(right,left);
        if(min > 0){
            ret = 1 + min;
        }
        
        return ret;
    }
}
