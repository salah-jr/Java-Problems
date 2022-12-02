package com.salah;

public class InsertIntoAbinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);

        if(root == null) return newNode;

        TreeNode cur = root;
        TreeNode prev = null;
        while(cur != null){
            prev = cur;
            if(cur.val >= val) cur = cur.left;
            else cur = cur.right;
        }

        if(prev.val >= val) prev.left = newNode;
        else prev.right = newNode;

        return root;
    }
}
