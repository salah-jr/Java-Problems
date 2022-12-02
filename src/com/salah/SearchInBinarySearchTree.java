package com.salah;

public class SearchInBinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;
        if (root.val < val) return searchBST(root.right, val);
        else return searchBST(root.left, val);
    }


//      Iterative solution
//
//    public TreeNode searchBST(TreeNode root, int val) {
//        if (root == null) return null;
//        TreeNode cur = root;
//        while (cur != null) {
//            if (cur.val == val) return cur;
//            else if (val < cur.val) {
//                cur = cur.left;
//            }
//            else {
//                cur = cur.right;
//            }
//        }
//        return null;
//    }
}
