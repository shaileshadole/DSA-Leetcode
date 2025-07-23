class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class IdenticalBinaryTrees {

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
    
    public static int flag = 0;

    public static void compare(TreeNode root1, TreeNode root2){
    if(root1 == null && root2 == null){
        return;
    }

    if(root1 == null || root2 == null || root1.val != root2.val){
        flag = 1;
        return;
    }

        compare(root1.left, root2.left);
        compare(root1.right, root2.right); 
    }

    public static boolean isSame(TreeNode root1, TreeNode root2){
        
        compare(root1, root2);
        
        if(flag == 0){
            return true;
        }
        return false;
    }




    public static void main(String[] args) {
        // Constructing two identical trees
        TreeNode root1 = constructTree();
        TreeNode root2 = constructTree();



        System.out.println("Two identical binary trees have been created with roots root1 and root2.");


        System.out.println(isSame(root1, root2));
    }
}
