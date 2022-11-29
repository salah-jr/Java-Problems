package com.salah;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                list.add(node.val);
                stack.push(node.left);
                stack.push(node.right);
            }
        }
        return list;
    }


    // recursively
    // public List<Integer> preorderTraversal1(TreeNode root) {
    //     List<Integer> list = new ArrayList<>();
    //     dfs(root, list);
    //     return list;
    // }

    // private void dfs(TreeNode root, List<Integer> list) {
    //     if (root != null) {
    //         list.add(root.val);
    //         dfs(root.left, list);
    //         dfs(root.right, list);
    //     }
    // }
}
