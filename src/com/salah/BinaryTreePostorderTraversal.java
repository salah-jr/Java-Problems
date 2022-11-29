package com.salah;

import java.util.Collections;
import java.util.List;

public class BinaryTreePostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = BinaryTreePreorderTraversal.preorderTraversal(root);
        Collections.reverse(list);
        return list;
    }


//    public List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        helper(root, res);
//        return res;
//    }
//
//
//    public void helper(TreeNode root, List<Integer> res) {
//        if (root != null) {
//            helper(root.left, res);
//            helper(root.right, res);
//            res.add(root.val);
//        }
//    }
}
