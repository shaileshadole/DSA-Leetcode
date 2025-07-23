import java.util.ArrayList;
import java.util.List;

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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<Integer>();

        inorder(root, list);
        System.out.println(list);
        return list;
    }

    public static void inorder(TreeNode root, List<Integer> list){

        if(root == null){
            return;
        }

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);


    }

        public static TreeNode constructTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        return root;
    }

    public static void main(String args[]){
        System.out.println("Hello");
        TreeNode root = constructTree();

        Solution s1 = new Solution();
        s1.inorderTraversal(root);
    }
}