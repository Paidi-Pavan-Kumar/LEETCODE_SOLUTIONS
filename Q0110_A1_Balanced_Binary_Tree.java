public class Q0110_A1_Balanced_Binary_Tree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (Math.abs(maxHeight(root.left) - maxHeight(root.right)) > 1) {
            return false;
        }
        boolean left1 = isBalanced(root.left);
        boolean right1 = isBalanced(root.right);
        return (left1 && right1);
    }

    public int maxHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxHeight(root.left);
        int right = maxHeight(root.right);
        return 1 + Math.max(left, right);
    }
}