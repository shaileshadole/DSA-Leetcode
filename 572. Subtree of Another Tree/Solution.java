import javax.swing.tree.TreeNode;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        if(root == null){
            return false;
        }

        if(compare(root, subRoot)){
            return true;
        }

        boolean left = isSubtree(root.left, subRoot);
        boolean right = isSubtree(root.right, subRoot);

        return left || right;
    }

    public static boolean compare(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null){
            return true;
        }

        if(root1 == null || root2 == null || root1.val != root2.val){
            return false;
        }

        return compare(root1.left, root2.left) && compare(root1.right, root2.right);
    }
}