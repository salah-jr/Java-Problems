package com.salah;

public class LowestCommonAncestorOfBst {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

         if(p.val < root.val && q.val < root.val){
             return lowestCommonAncestor(root.left, p, q);
         }

         if(p.val > root.val && q.val > root.val){
             return lowestCommonAncestor(root.right, p, q);
         }

         return root;
    }

//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//
//        while (root != null) {
//            if (root.val > p.val && root.val > q.val) {
//                root = root.left;
//            } else  if (root.val < p.val && root.val < q.val){
//                root = root.right;
//            } else return root;
//        }
//
//        return root;
//    }
}
