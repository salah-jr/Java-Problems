package com.salah;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        helper(root);
        return root;
    }

    static void helper(TreeNode root){
        if(root != null){
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            helper(root.left);
            helper(root.right);
        }
    }
}
