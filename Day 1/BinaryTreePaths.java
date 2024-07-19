/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        binaryTreePaths(ans, "", root);
        return ans;
    }

    private void binaryTreePaths(List<String> ans, String curr, TreeNode root) {
        if (root.left == null && root.right == null)
            ans.add(curr + root.val);
        if (root.left != null)
            binaryTreePaths(ans, curr + root.val + "->", root.left);
        if (root.right != null)
            binaryTreePaths(ans, curr + root.val + "->", root.right);
    }
}