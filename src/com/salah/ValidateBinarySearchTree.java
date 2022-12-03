package com.salah;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        return helper(root, null, null);
    }

    static boolean helper(TreeNode root, Integer low, Integer high){
        if(root == null) return true;

        if((low != null && root.val <= low) || (high != null && root.val >= high)) return false;

        return helper(root.right, root.val, high) && helper(root.left, low, root.val);

    }



}
