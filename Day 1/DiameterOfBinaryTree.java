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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] maxi = new int[1];
        maxi[0] = 0;
        int n = helper(root,maxi);
        return maxi[0];
    }
    private int helper(TreeNode root, int[] maxi){
        if(root==null) return 0;
        int r = helper(root.right, maxi);
        int l = helper(root.left, maxi);
        maxi[0] = Math.max(r+l,maxi[0]);
        return 1+Math.max(r,l);
    }
}